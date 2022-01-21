package com.github.youshu.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import com.github.youshu.bean.request.YoushuRequest;
import com.github.youshu.bean.request.data.YoushuDataSource;
import com.github.youshu.bean.request.order.OrderAdd;
import com.github.youshu.bean.request.order.OrderBean;
import com.github.youshu.bean.request.sku.Sku;
import com.github.youshu.bean.request.sku.SkuBean;
import com.github.youshu.bean.request.sku.categorie.CategoriesBean;
import com.github.youshu.bean.request.sku.many.SkuMany;
import com.github.youshu.bean.request.sku.sale.SalesInfoBean;
import com.github.youshu.bean.request.sku.spu.SpusBean;
import com.github.youshu.bean.request.sku.store.StoreBean;
import com.github.youshu.bean.request.wxappvisit.WxappVisitBean;
import com.github.youshu.bean.response.YoushuResponse;
import com.github.youshu.bean.response.data.DataSourceAdd;
import com.github.youshu.bean.response.data.DataSourceGet;
import com.github.youshu.config.YoushuProperties;
import com.github.youshu.enums.InterfaceType;
import com.github.youshu.service.YoushuApi;
import com.github.youshu.utils.YoushuApiSignature;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class YoushuApiImpl implements YoushuApi {
    private final YoushuProperties properties;

    /**
     * 上报页面访问数据
     */
    @Override
    public YoushuResponse wxappVisitPage(WxappVisitBean wxappVisitBean) {
        return send(wxappVisitBean, InterfaceType.ADD_WXAPP_VISIT_PAGE);
    }

    /**
     * 商品信息变更（单店版）
     */
    @Override
    public YoushuResponse updateSku(SkuBean<Sku> skuBean) {
        return send(skuBean, InterfaceType.UPDATE_SKU);
    }

    /**
     * 商品信息添加（单店版）
     */
    @Override
    public YoushuResponse addSku(SkuBean<Sku> skuBean) {
        return send(skuBean, InterfaceType.ADD_SKU);
    }

    /**
     * 退货退款订单添加
     */
    @Override
    public YoushuResponse returnOrder(OrderBean orderBean) {
        return send(orderBean, InterfaceType.RETURN_ORDER);
    }

    /**
     * 汇总订单接口
     * 每天 6:00 前完成前一天的数据上报。
     */
    @Override
    public YoushuResponse addOrderSum(OrderBean orderBean) {
        return send(orderBean, InterfaceType.ADD_ORDER_SUM);
    }

    /**
     * 订单状态变更
     */
    @Override
    public YoushuResponse updateOrder(OrderBean orderBean) {
        return send(orderBean, InterfaceType.UPDATE_ORDER);
    }

    /**
     * 添加/更新订单
     */
    @Override
    public YoushuResponse addOrder(OrderBean<OrderAdd> orderBean) {
        return send(orderBean, InterfaceType.ADD_ORDER);
    }

    /**
     * 添加数据仓库
     */
    @Override
    public YoushuResponse<DataSourceAdd> addDataSource() {
        String url = getUrl(InterfaceType.ADD_DATA_SOURCE);
        YoushuDataSource dataSource = new YoushuDataSource();
        dataSource.setMerchantId(properties.getMerchantId());
        String reqBody = JSONUtil.toJsonStr(dataSource);
        return sendYoushu(url, reqBody);
    }

    /**
     * 获取数据仓库
     */
    @Override
    public YoushuResponse<DataSourceGet> getDataSource() {
        String url = getUrl(InterfaceType.GET_DATA_SOURCE);
        String body = HttpRequest.get(url)
                .header("Accept ", "application/json")
                .setConnectionTimeout(3000)
                .execute().body();
        System.out.println("getDataSource:" + body);
        return JSONUtil.toBean(body, YoushuResponse.class);
    }

    /**
     * 上报日访问趋势
     */
    @Override
    public YoushuResponse wxappVisitDaily(WxappVisitBean wxappVisitBean) {
        return send(wxappVisitBean, InterfaceType.ADD_WXAPP_DAILY_VISIT_TREND);
    }

    /**
     * 上报日访问趋势
     */
    @Override
    public YoushuResponse wxappVisitDistribution(WxappVisitBean wxappVisitBean) {
        return send(wxappVisitBean, InterfaceType.ADD_WXAPP_VISIT_DISTRIBUTION);
    }

    /**
     * 添加/更新商品类目
     */
    @Override
    public YoushuResponse addProductCategories(CategoriesBean categoriesBean) {
        return send(categoriesBean, InterfaceType.ADD_PRODUCT_CATEGORIES);
    }

    /**
     * 销售信息添加/变更（多店版）
     */
    @Override
    public YoushuResponse addSalesInfo(SalesInfoBean salesInfoBean) {
        return send(salesInfoBean, InterfaceType.ADD_SALESINFO);
    }

    /**
     * 商品 SPU 添加/变更（多店版）
     */
    @Override
    public YoushuResponse addSpus(SpusBean spusBean) {
        return send(spusBean, InterfaceType.ADD_SPUS);
    }

    /**
     * 商品 SKU 添加/变更（多店版）
     */
    @Override
    public YoushuResponse addSkuMany(SkuBean<SkuMany> skuManyBean) {
        return send(skuManyBean, InterfaceType.ADD_SKU_MANY);
    }

    /**
     * 门店仓库添加/变更（多店版）
     */
    @Override
    public YoushuResponse addStore(StoreBean storeBean) {
        return send(storeBean, InterfaceType.ADD_STORE);
    }

    private YoushuResponse send(YoushuRequest youshuRequest, InterfaceType interfaceType) {
        String url = getUrl(interfaceType);
        if (StrUtil.isNotEmpty(properties.getDataSourceId())) {
            youshuRequest.setDataSourceId(properties.getDataSourceId());
        }
        String reqBody = JSONUtil.toJsonStr(youshuRequest);
        return sendYoushu(url, reqBody);
    }

    private String getUrl(InterfaceType interfaceType) {
        String domain = "";
        if ("SANDBOX".equals(properties.getEnvironment())) {
            domain = "https://test.zhls.qq.com/";
        } else if ("PRODUCTION".equals(properties.getEnvironment())) {
            domain = "https://zhls.qq.com/";
        }
        return domain + InterfaceType.getAddress(interfaceType) + "?" + new YoushuApiSignature(properties.getApp_id(), properties.getApp_secret()).sign();
    }

    private YoushuResponse sendYoushu(String url, String reqBody) {
        String body = HttpRequest.post(url).body(reqBody)
                .header("Accept ", "application/json")
                .setConnectionTimeout(3000).setReadTimeout(10000)
                .execute().body();
        System.out.println("res:" + body);
        return JSONUtil.toBean(body, YoushuResponse.class);
    }
}

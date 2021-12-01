package com.github.youshujava.service.impl;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import com.github.youshujava.bean.request.data.YoushuDataSource;
import com.github.youshujava.bean.request.order.OrderAdd;
import com.github.youshujava.bean.request.order.OrderBean;
import com.github.youshujava.bean.request.sku.SkuBean;
import com.github.youshujava.bean.request.wxappvisit.WxappVisitPageBean;
import com.github.youshujava.bean.response.YoushuResponse;
import com.github.youshujava.bean.response.data.DataSourceAdd;
import com.github.youshujava.bean.response.data.DataSourceGet;
import com.github.youshujava.config.YoushuProperties;
import com.github.youshujava.enums.InterfaceType;
import com.github.youshujava.service.YoushuApi;
import com.github.youshujava.utils.YoushuApiSignature;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class YoushuApiImpl implements YoushuApi {
    private final YoushuProperties properties;

    /**
     * 上报页面访问数据
     */
    @Override
    public YoushuResponse updateSku(WxappVisitPageBean wxappVisitPageBean) {
        return wxappVisit(wxappVisitPageBean, InterfaceType.ADD_WXAPP_VISIT_PAGE);
    }

    /**
     * 商品信息变更（单店版）
     */
    @Override
    public YoushuResponse updateSku(SkuBean skuBean) {
        return sku(skuBean, InterfaceType.UPDATE_SKU);
    }

    /**
     * 商品信息添加（单店版）
     */
    @Override
    public YoushuResponse addSku(SkuBean skuBean) {
        return sku(skuBean, InterfaceType.ADD_SKU);
    }

    /**
     * 退货退款订单添加
     */
    @Override
    public YoushuResponse returnOrder(OrderBean orderBean) {
        return order(orderBean, InterfaceType.RETURN_ORDER);
    }

    /**
     * 汇总订单接口
     * 每天 6:00 前完成前一天的数据上报。
     */
    @Override
    public YoushuResponse addOrderSum(OrderBean orderBean) {
        return order(orderBean, InterfaceType.ADD_ORDER_SUM);
    }

    /**
     * 订单状态变更
     */
    @Override
    public YoushuResponse updateOrder(OrderBean orderBean) {
        return order(orderBean, InterfaceType.UPDATE_ORDER);
    }

    /**
     * 添加/更新订单
     */
    @Override
    public YoushuResponse addOrder(OrderBean<OrderAdd> orderBean) {
        return order(orderBean, InterfaceType.ADD_ORDER);
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
        log.info("getDataSource:" + body);
        return JSONUtil.toBean(body, YoushuResponse.class);
    }

    public String getUrl(InterfaceType interfaceType) {
        String domain = "";
        if ("SANDBOX".equals(properties.getEnvironment())) {
            domain = "https://test.zhls.qq.com/";
        } else if ("PRODUCTION".equals(properties.getEnvironment())) {
            domain = "https://zhls.qq.com/";
        }
        return domain + InterfaceType.getAddress(interfaceType) + "?" + new YoushuApiSignature(properties.getApp_id(), properties.getApp_secret()).sign();
    }

    public YoushuResponse order(OrderBean orderBean, InterfaceType interfaceType) {
        String url = getUrl(interfaceType);
        String reqBody = JSONUtil.toJsonStr(orderBean);
        return sendYoushu(url, reqBody);
    }

    public YoushuResponse wxappVisit(WxappVisitPageBean wxappVisitPageBean, InterfaceType interfaceType) {
        String url = getUrl(interfaceType);
        String reqBody = JSONUtil.toJsonStr(wxappVisitPageBean);
        return sendYoushu(url, reqBody);
    }

    public YoushuResponse sku(SkuBean skuBean, InterfaceType interfaceType) {
        String url = getUrl(interfaceType);
        String reqBody = JSONUtil.toJsonStr(skuBean);
        return sendYoushu(url, reqBody);
    }

    private YoushuResponse sendYoushu(String url, String reqBody) {
        String body = HttpRequest.post(url).body(reqBody)
                .header("Accept ", "application/json")
                .setConnectionTimeout(3000).setReadTimeout(10000)
                .execute().body();
        log.info("res:" + body);
        return JSONUtil.toBean(body, YoushuResponse.class);
    }
}

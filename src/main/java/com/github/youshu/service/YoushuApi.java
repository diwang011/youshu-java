package com.github.youshu.service;


import com.github.youshu.bean.request.order.*;
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

public interface YoushuApi {

    /**
     * 上报步骤：每天早上 12 点前（推荐11:30）调用微信 analysis.getVisitPage (opens new window)接口
     * 上报页面访问数据
     */
    YoushuResponse wxappVisitPage(WxappVisitBean wxappVisitBean);

    /**
     * 商品信息变更（单店版）
     */
    YoushuResponse updateSku(SkuBean<Sku> skuBean);

    /**
     * 商品信息添加（单店版）
     */
    YoushuResponse addSku(SkuBean<Sku> skuBean);

    /**
     * 退货退款订单添加
     */
    YoushuResponse returnOrder(OrderBean<OrderReturn> orderBean);

    /**
     * 汇总订单接口
     * 每天 6:00 前完成前一天的数据上报。
     */
    YoushuResponse addOrderSum(OrderBean<OrderSum> orderBean);

    /**
     * 订单状态变更
     */
    YoushuResponse updateOrder(OrderBean<OrderUpdate> orderBean);

    /**
     * 添加/更新订单
     */
    YoushuResponse addOrder(OrderBean<OrderAdd> orderBean);

    /**
     * 添加数据仓库
     */
    YoushuResponse<DataSourceAdd> addDataSource();

    /**
     * 获取数据仓库
     */
    YoushuResponse<DataSourceGet> getDataSource();


    //=====================================================================================================

    /**
     * 上报步骤：每天早上 12 点前（推荐11:30）调用微信 analysis.getDailyVisitTrend 接口
     * 上报日访问趋势
     */
    YoushuResponse wxappVisitDaily(WxappVisitBean wxappVisitBean);

    /**
     * 上报步骤：每天早上 10 点调用微信 analysis.getVisitDistribution (opens new window)接口。
     * 报访问分布
     */
    YoushuResponse wxappVisitDistribution(WxappVisitBean wxappVisitBean);

    /**
     * 添加/更新商品类目
     */
    YoushuResponse addProductCategories(CategoriesBean categoriesBean);

    /**
     * 销售信息添加/变更（多店版）
     */
    YoushuResponse addSalesInfo(SalesInfoBean salesInfoBean);

    /**
     * 商品 SPU 添加/变更（多店版）
     */
    YoushuResponse addSpus(SpusBean spusBean);

    /**
     * 商品 SKU 添加/变更（多店版）
     */
    YoushuResponse addSkuMany(SkuBean<SkuMany> skuBean);

    /**
     * 门店仓库添加/变更（多店版）
     */
    YoushuResponse addStore(StoreBean storeBean);
}

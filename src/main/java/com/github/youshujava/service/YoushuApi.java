package com.github.youshujava.service;

import com.github.youshujava.bean.request.order.*;
import com.github.youshujava.bean.request.sku.SkuBean;
import com.github.youshujava.bean.request.wxappvisit.WxappVisitPageBean;
import com.github.youshujava.bean.response.YoushuResponse;
import com.github.youshujava.bean.response.data.DataSourceAdd;
import com.github.youshujava.bean.response.data.DataSourceGet;

public interface YoushuApi {

    /**
     * 数据来源：每天早上 12 点前（推荐11:30）调用微信 analysis.getVisitPage (opens new window)接口
     * 上报页面访问数据
     */
    public YoushuResponse updateSku(WxappVisitPageBean wxappVisitPageBean);

    /**
     * 商品信息变更（单店版）
     */
    public YoushuResponse updateSku(SkuBean skuBean);

    /**
     * 商品信息添加（单店版）
     */
    public YoushuResponse addSku(SkuBean skuBean);

    /**
     * 退货退款订单添加
     */
    public YoushuResponse returnOrder(OrderBean<OrderReturn> orderBean);

    /**
     * 汇总订单接口
     * 每天 6:00 前完成前一天的数据上报。
     */
    public YoushuResponse addOrderSum(OrderBean<OrderSum> orderBean);

    /**
     * 订单状态变更
     */
    public YoushuResponse updateOrder(OrderBean<OrderUpdate> orderBean);

    /**
     * 添加/更新订单
     */
    public YoushuResponse addOrder(OrderBean<OrderAdd> orderBean);

    /**
     * 添加数据仓库
     */
    public YoushuResponse<DataSourceAdd> addDataSource();

    /**
     * 获取数据仓库
     */
    public YoushuResponse<DataSourceGet> getDataSource();


}

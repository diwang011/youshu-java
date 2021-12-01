/**
 * Copyright 2021 bejson.com
 */
package com.github.youshujava.bean.request.sku;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class SalesInfo {
    /**
     * 商品总库存量，当product_type=3（小样）时必填
     */
    private Integer stock_total;
    /**
     * 上架状态；true：上架；false：下架
     * 必填
     */
    private Boolean is_available;
    /**
     * 商品的销售状态 1：库存＞0；2：库存≤0（常见为售罄/暂无库存商品在页面底部展示，可标记为状态2）
     */
    private Integer sku_stock_status;
    /**
     * 展示销量
     */
    private Integer sales_num;
    /**
     * 商品类型，1：普通商品；2：赠品；3：小样
     */
    private Integer product_type;
}
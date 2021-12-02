package com.github.youshu.bean.request.sku.sale;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class Price {
    /**
     * 商品日常售价，单位：元，保留两位小数
     * 必填
     */
    private Float daily_price;
    /**
     * 商品目前售价，单位：元，保留2位小数；大于等于0，最小值0；current_price需≤sku_price
     * 必填
     */
    private Float current_price;
    /**
     * 商品原价，单位：元，保留2位小数；大于等于0，最小值0；current_price需≤sku_price
     * 必填
     */
    private Float sku_price;
}
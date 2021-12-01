/**
 * Copyright 2021 bejson.com
 */
package com.github.youshu.bean.request.sku;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class Price {
    /**
     *商品现价，单位元
     * 必填
     */
    private Float current_price;
    /**
     *商品原价，单位元
     * 必填
     */
    private Float sku_price;

}
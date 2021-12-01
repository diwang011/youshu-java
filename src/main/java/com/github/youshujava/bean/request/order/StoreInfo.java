/**
 * Copyright 2021 bejson.com
 */
package com.github.youshujava.bean.request.order;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class StoreInfo {
    /**
     *	主订单销售门店id
     */
    private String external_store_id;
    /**
     *	主订单销售门店名称
     */
    private String store_name;
    /**
     *	主订单销售门店所属城市
     */
    private String store_city;
}
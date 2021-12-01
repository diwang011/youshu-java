/**
 * Copyright 2021 bejson.com
 */
package com.github.youshu.bean.request.order;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class OrderUpdate {
    /**
     * 商家订单号
     * 必填
     */
    private String external_order_id;
    /**
     * 主订单状态，1110待支付，1130未支付取消，1140已支付未发货取消，1150已支付待发货，1160已发货，1180销售完成/已收货
     * 必填
     */
    private String order_status;
    /**
     * 	状态变更时间，unix毫秒级时间，如 order_status状态为 1150 ，则传 1150（已支付待发货）状态变更的时间
     * 必填
     */
    private String status_change_time;


}
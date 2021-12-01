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
public class PaymentInfo {
    /**
     *支付方式
     */
    private String payment_type;
    /**
     * 微信支付订单ID/流水号
     */
    private String trans_id;
    /**
     *金额，单位默认为元
     */
    private Float trans_amount;
}
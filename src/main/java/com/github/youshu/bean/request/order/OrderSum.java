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
public class OrderSum {
    /**
     * 日期，unix时间戳，字段长度为13字节
     * 必填
     */
    private String ref_date;
    /**
     * 该日期的下单金额之和
     * 必填
     */
    private Float give_order_amount_sum;
    /**
     * 该日期的下单数量之和
     * 必填
     */
    private Integer give_order_num_sum;
    /**
     * 该日期的支付金额之和
     * 必填
     */
    private Float payment_amount_sum;
    /**
     * 该日期的支付数量之和
     * 必填
     */
    private Integer payed_num_sum;

}
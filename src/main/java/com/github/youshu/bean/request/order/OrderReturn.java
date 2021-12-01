/**
 * Copyright 2021 bejson.com
 */
package com.github.youshu.bean.request.order;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class OrderReturn {
    /**
     * 商家退货退款单号
     * 必填
     */
    private String external_return_order_id;
    /**
     * 关联的订单号
     * 必填
     */
    private String external_order_id;
    /**
     * 货退款单创建时间，unix时间戳 字段长度为 13 字节
     * 必填
     */
    private String return_create_time;
    /**
     * 该笔退货退款单的商品数量
     * 必填
     */
    private Integer return_num;
    /**
     * 笔退货退款单的商品退款金额，单位元，2位小数
     * 必填
     */
    private Float return_amount;
    /**
     * 运费退款金额，单位元，2位小数注：运费为0时，传0
     * 必填
     */
    private Float return_freight_amount;
    /**
     * 该笔退货退款单的退款金额，单位元，2位小数注：商品退款金额+运费退款金额=订单金额
     * 必填
     */
    private Float return_order_amount;
    /**
     * 退货退款单状态，传1290（退货退款完成）
     * 必填
     */
    private String return_order_status;
    /**
     * 状态变更时间，unix毫秒级时间
     * 必填
     */
    private String status_change_time;
    /**
     * 主订单商品信息，数组类型，每个sku存一个数组单位
     * 必填
     */
    private List<ReturnGoodsInfo> return_goods_info;

}
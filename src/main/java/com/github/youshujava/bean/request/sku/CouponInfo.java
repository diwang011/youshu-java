/**
 * Copyright 2021 bejson.com
 */
package com.github.youshujava.bean.request.sku;

import lombok.Data;

import java.util.Date;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class CouponInfo {
    /**
     * 券批次id 字段长度最小 1 字节，长度最大 100 字节
     */
    private Date coupon_id;
    /**
     * 券面额，单位元，字段长度最小 1 字节，长度最大 100 字节
     */
    private Float amount_coupon;
    /**
     * 券地址
     */
    private String url_list;
    /**
     * 使用卡券的最低消费金额，单位元
     */
    private Float amount_minimum;
    /**
     * 展示开始时间/券领取开始时间，unix毫秒级时间戳，为空表示永久
     */
    private String show_start_time;
    /**
     * 展示结束时间/券领取结束时间，unix毫秒级时间戳，为空表示永久
     */
    private String show_end_time;
    /**
     * 券有效使用开始时间，unix毫秒级时间戳，为空表示永久
     */
    private String start_time;
    /**
     * 券有效使用结束时间，unix毫秒级时间戳，为空表示永久
     */
    private String end_time;
    /**
     * 优惠券状态，1：过期；0：未过期
     */
    private Integer status;

}
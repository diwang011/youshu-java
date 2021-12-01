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
public class CouponDetail {
    /**
     * 券 id
     */
    private String external_coupon_id;
    /**
     * 券批次 id（该字段需要在优惠券接口中添加卡券批次）
     */
    private String coupon_batch_id;
    /**
     * 券名称
     */
    private String coupon_name;
    /**
     * 分摊至该订单的该张券折扣金额，单位默认为元
     */
    private Float coupon_amount;

}
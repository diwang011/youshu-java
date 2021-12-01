/**
 * Copyright 2021 bejson.com
 */
package com.github.youshujava.bean.request.order;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class CouponInfo {
    /**
     * 卡券类型；1：商家券；2：微信支付券
     */
    private Integer coupon_type;
    /**
     * 该类券优惠金额总额，单位默认为元
     */
    private Float coupon_amount_total;
    /**
     * 该类券的细节券信息
     */
    private List<CouponDetail> coupon_detail;

}
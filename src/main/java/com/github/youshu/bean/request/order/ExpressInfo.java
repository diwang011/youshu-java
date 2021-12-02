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
public class ExpressInfo {
    /**
     *	订单物流状态
     */
    private String logistics_status;
    /**
     *商品总重量，单位默认为克
     */
    private Float goods_total_weight;
    /**
     *收件人名称
     */
    private String receiver_name;
    /**
     *收件人联系电话，sha256加密
     */
    private String sha256_receiver_phone;
    /**
     *收件人地址
     */
    private String receiver_address;
    /**
     *国家编码
     */
    private String receiver_country_code;
    /**
     *省份编码
     */
    private String receiver_province_code;
    /**
     *城市编码
     */
    private String receiver_city_code;
    /**
     *区编码
     */
    private String receiver_district_code;
    /**
     *期望送货时间段，格式为“起始时间-结束时间”，如"9:00-12:00"
     */
    private String expected_delivery_time;
    /**
     *期望送货日期，格式“YYYYMMDD”
     */
    private String expected_delivery_date;
    /**
     *包裹信息
     */
    private List<ExpressPackageInfo> express_package_info;

}
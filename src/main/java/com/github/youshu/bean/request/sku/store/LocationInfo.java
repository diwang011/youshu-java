package com.github.youshu.bean.request.sku.store;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class LocationInfo {
    /**
     * 国家编码，CN 字段长度最小 1 字节，长度最大 64 字节
     */
    private String country_code;
    /**
     * 国家名称，中国 字段长度最小 1 字节，长度最大 64 字节
     * 必填
     */
    private String country_name;
    /**
     * 省份编码，使用《统计用区划代码和城乡分代码编制规则》，440000
     */
    private Integer province_code;
    /**
     * 省份名称，XX省 字段长度最小 1 字节，长度最大 64 字节
     * 必填
     */
    private String province_name;
    /**
     * 城市编码，使用《统计用区划代码和城乡分代码编制规则》
     */
    private Integer city_code;
    /**
     * 城市名称，XX市 字段长度最小 1 字节，长度最大 64 字节
     * 必填
     */
    private String city_name;
    /**
     * 行政区编码，使用《统计用区划代码和城乡分代码编制规则》
     */
    private Integer district_code;
    /**
     * 行政区名称XX区 字段长度最小 1 字节，长度最大 64 字节
     * 必填
     */
    private String district_name;
    /**
     * 店仓详细地址
     * 必填
     */
    private String address;

}
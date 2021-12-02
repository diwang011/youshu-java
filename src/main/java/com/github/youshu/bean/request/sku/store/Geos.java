package com.github.youshu.bean.request.sku.store;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class Geos {
    /**
     * 坐标类型，若填写了longitude和latitude则必填；1：腾讯/高德地图；2：百度地图：3：国际标准
     */
    private Integer type;
    /**
     * 电子围栏纬度，如：22.5200，range_type=3时必填
     */
    private Float latitude;
    /**
     * 电子围栏经度，如：113.9400，range_type=3时必填
     */
    private Float longitude;

}
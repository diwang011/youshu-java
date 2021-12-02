package com.github.youshu.bean.request.sku.store;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class DeliveryInfo {
    /**
     * 配送范围类型 1：圆形；3：多边形；store支持到家配送时必填
     */
    private Integer range_type;
    /**
     * 配送半径 range_type = 1 时必填 字段长度最小 1 字节，长度最大 128 字节
     */
    private String radius;
    /**
     * 坐标信息组合，坐标点的二维数组，表示多个形状，range_type=3时必填
     */
    private List<GeoGroup> geo_group;

}
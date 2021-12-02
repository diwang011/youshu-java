package com.github.youshu.bean.request.sku;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class StoreInfo {
    /**
     * 店铺id，填写`store_name`时必填，字段长度最小 1 字节，长度最大 100 字节
     */
    private String external_store_id;
    /**
     * 店铺名称，填写`external_store_id`时必填，字段长度最小 1 字节，长度最大 100 字节
     */
    private String store_name;
    /**
     * 按满分5分换算的店铺评分，2位小数
     */
    private double store_grade;

}
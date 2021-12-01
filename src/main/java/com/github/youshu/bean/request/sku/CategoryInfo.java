/**
 * Copyright 2021 bejson.com
 */
package com.github.youshu.bean.request.sku;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class CategoryInfo {
    /**
     * 类目类型，1：前台类目；2：后台类目
     * 必填
     */
    private Integer category_type;
    /**
     * 一级类目id
     * 必填
     */
    private String category_level_1_id;
    /**
     * 一级类目名称
     * 必填
     */
    private String category_level_1_name;
    /**
     * 二级类目id
     */
    private String category_level_2_id;
    /**
     * 二级类目名称
     */
    private String category_level_2_name;
    /**
     * 三级类目id
     */
    private String category_level_3_id;
    /**
     * 三级类目名称
     */
    private String category_level_3_name;

}
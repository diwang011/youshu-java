/**
 * Copyright 2021 bejson.com
 */
package com.github.youshu.bean.request.order;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class ChanCustom {
    /**
     * 自定义渠道的标识符，是自定义渠道的最小粒度
     */
    private String chan_custom_id;
    /**
     * 自定义渠道的描述
     */
    private String chan_custom_id_desc;
    /**
     * 3级自定义渠道的标识符，3级是针对4级的分类，要求4级数据必须存在
     */
    private String chan_custom_cat_3;
    /**
     * 3级自定义渠道的描述，若chan_custom_cat_3存在则必须存在
     */
    private String chan_custom_cat_3_desc;
    /**
     * 2级自定义渠道的标识符，2级是针对3级的分类，要求3、4级数据必须存在
     */
    private String chan_custom_cat_2;
    /**
     * 2级自定义渠道的描述，若chan_custom_cat_2存在则必须存在
     */
    private String chan_custom_cat_2_desc;
    /**
     * 1级自定义渠道的标识符，1级是针对2级的分类，要求2、3、4级数据必须存在
     */
    private String chan_custom_cat_1;
    /**
     * 1级自定义渠道的描述，若chan_custom_cat_1存在则必须存在
     */
    private String chan_custom_cat_1_desc;
}
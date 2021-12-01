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
public class ChanInfo {
    /**
     * 小程序渠道
     */
    private ChanWxapp chan_wxapp;
    /**
     * 自定义渠道
     */
    private ChanCustom chan_custom;
    /**
     * 智慧零售入口小程序必传，来源小程序或公众号appid
     */
    private String chan_refer_app_id;
    /**
     * 智慧零售入口小程序必传，引流渠道编码
     */
    private String chan_id;

}
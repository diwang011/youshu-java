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
public class TargetUrl {
    /**
     * 微信小程序落地页 url，当落地页为微信小程序时必填 字段长度最小 1 字节，长度最大 100 字节
     */
    private String url_miniprogram;
    /**
     * 微信小程序 appid，当落地页为微信小程序时必填 字段长度最小 1 字节，长度最大 100 字节
     */
    private String miniprogram_appid;
    /**
     * 小程序原始ID，登录小程序管理后台-设置-基本设置-帐号信息中，gh_xx，当落地页为微信小程序时必填字段长度最小 1 字节，长度最大 100 字节
     */
    private String miniprogram_username;
    /**
     * qq小程序落地页 url，当落地页为QQ小程序时必填 字段长度最小 1 字节，长度最大 100 字节
     */
    private String url_miniprogram_qq;
    /**
     * qq小程序 appid，当落地页为QQ小程序时必填 字段长度最小 1 字节，长度最大 100 字节
     */
    private String miniprogram_appid_qq;
    /**
     * h5落地页url 字段长度最小 1 字节，长度最大 100 字节
     */
    private String url_h5;


}
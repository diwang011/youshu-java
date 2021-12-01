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
public class ExpressPage {
    /**
     *	快递详情页跳转链接（小程序页面，小程序填此字段）
     */
    private String miniprogram_path;
    /**
     *	小程序APPID，填写了miniprogram_path需填此字段
     */
    private String miniprogram_appid;
    /**
     *	快递详情页跳转链接（h5页面，公众号填此字段）
     */
    private String miniprogram_h5;

}
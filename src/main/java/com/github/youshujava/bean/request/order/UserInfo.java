/**
 * Copyright 2021 bejson.com
 */
package com.github.youshujava.bean.request.order;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class UserInfo {
    /**
     * 下单人 open_id，order_source = wxapp时，必填
     * 必填
     */
    private String open_id;
    /**
     * 程序或公众号的appid
     */
    private String app_id;
    /**
     * 下单人 union_id
     */
    private String union_id;
    /**
     * 下单人手机号，sha256加密
     */
    private String sha256_user_phone;
    /**
     * 下单人用户 id
     */
    private String user_id;
    /**
     * 下单人会员号
     */
    private String member_id;
    /**
     * 会员卡等级
     */
    private String card_level;
    /**
     * 下单人在KA注册后首次下单时间，格式为UNIX时间戳 字段长度为 13 字节
     */
    private String user_first_order_time;

}
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
public class CommissionInfo {
    /**
     * 佣金类型，枚举值如下：1：按比例提成；2：按金额提成
     */
    private Integer commission_type;
    /**
     * 佣金金额，单位元
     */
    private Float commission_fee;
}
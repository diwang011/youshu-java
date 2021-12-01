/**
 * Copyright 2021 bejson.com
 */
package com.github.youshu.bean.request.order;

import com.github.youshu.bean.request.YoushuRequest;
import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class OrderBean<T> extends YoushuRequest {
    /**
     * 订单列表 数组最大长度 50
     * 必填
     */
    private List<T> orders;
}
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
public class CommentInfo {
    /**
     * 	商品评论数
     */
    private Integer comment_num;
    /**
     * 商品好评率，2位小数，不带百分号，如 99.99% 填 99.99
     */
    private Float positive_comment_rating;

}
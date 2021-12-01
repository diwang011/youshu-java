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
public class Img {
    /**
     *商品图地址；图片320*320以上，10张，正方形图片可正常打开 字段长度最小 1 字节，长度最大 2048 字节
     * 必填
     */
    private String img_url;

}
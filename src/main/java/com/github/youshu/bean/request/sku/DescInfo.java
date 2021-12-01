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
public class DescInfo {
    /**
     *商品中文名称，字段长度最小 1 字节，长度最大 100 字节
     * 必填
     */
    private String product_name_chinese;
    /**
     *商品英文名 字段长度最小 1 字节，长度最大 1000 字节
     */
    private String product_name_english;
    /**
     *商品描述，字段长度最小 1 字节，长度最大 1000 字节
     */
    private String product_desc;

}
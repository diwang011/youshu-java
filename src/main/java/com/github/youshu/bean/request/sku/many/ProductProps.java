package com.github.youshu.bean.request.sku.many;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class ProductProps {
    /**
     * 商品颜色属性，色码款商品必传
     */
    private Color color;
    /**
     * true：线上线下同款；false：线上线下不同款
     */
    private Boolean is_o2o;
    /**
     * 商品尺码，色码款商品必传 字段长度最小 1 字节，长度最大 8 字节
     */
    private String size;

}
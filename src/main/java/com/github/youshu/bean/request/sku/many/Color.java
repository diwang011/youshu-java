package com.github.youshu.bean.request.sku.many;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class Color {
    /**
     * 颜色RGB编码 字段长度最小 1 字节，长度最大 64 字节
     */
    private String color_rgb;
    /**
     * 颜色名称，如黄色 字段长度最小 1 字节，长度最大 64 字节
     */
    private String color_name;

}
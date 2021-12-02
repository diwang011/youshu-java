package com.github.youshu.bean.request.sku.spu;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/12/2 16:30
 */
@Data
public class Spus {
    /**
     * 您为商品SPU分配的唯一ID。 一般而言，是您在商品库为该商品SpU分配的id。 字段长度最小 1 字节，长度最大 128 字节
     * 必填
     */
    private String external_spu_id;
    /**
     * 商品描述类型
     * 必填
     */
    private DescProps desc_props;
    /**
     * 商家标记商品 spu 信息已删除，0：未删除；1：已删除，为空默认为 0
     */
    private Integer is_deleted;
}

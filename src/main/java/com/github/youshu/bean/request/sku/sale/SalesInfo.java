package com.github.youshu.bean.request.sku.sale;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class SalesInfo {
    /**
     * 商客户侧店铺/仓库 id 字段长度最小 1 字节，长度最大 32 字节
     * 必填
     */
    private String external_sku_id;
    /**
     * 您为商品 sku 分配的唯一 id。 色码款商品必填。 字段长度最小 1 字节，长度最大 128 字节
     * 必填
     */
    private String external_store_id;
    /**
     * 商品价格信息
     * 必填
     */
    private Price price;
    /**
     * 库存信息
     * 必填
     */
    private Stock stock;
    /**
     * 商品目标页信息
     */
    private TargetUrlProps target_url_props;
    /**
     * 商家标记商品 salesinfo 信息已删除，0：未删除；1：已删除，为空默认为 0
     */
    private Integer is_deleted;
}
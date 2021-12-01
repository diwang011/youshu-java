/**
 * Copyright 2021 bejson.com
 */
package com.github.youshu.bean.request.sku;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class Sku {
    /**
     * 您为商品SKU分配的唯一ID。 一般而言，是您在商品库为该商品SKU分配的id。 字段长度最小 1 字节，长度最大 128 字节
     * 必填
     */
    private String external_sku_id;
    /**
     * 商品的sku聚合id，供推荐、搜索场景使用。 字段长度最小 1 字节，长度最大 128 字节
     */
    private String poly_sku_id;
    /**
     * 您为商品SPU分配的唯一ID。 色码款商品必填。 字段长度最小 1 字节，长度最大 128 字节
     */
    private String external_spu_id;
    /**
     * 商品条形码，超市商品必填。字段长度最小 1 字节，长度最大 64 字节
     */
    private String sku_barcode;
    /**
     * 品牌名称。字段长度最小 1 字节，长度最大 64 字节
     */
    private String brand_name;
    /**
     * 商品图片及视频信息 数组最大长度 10
     * 必填
     */
    private MediaInfo media_info;
    /**
     * 类目信息
     * 必填
     */
    private List<CategoryInfo> category_info;
    /**
     * 商品销售信息
     * 必填
     */
    private SalesInfo sales_info;
    /**
     * 商品描述信息
     * 必填
     */
    private DescInfo desc_info;
    /**
     * 商品销售信息
     * 必填
     */
    private Price price;
    /**
     * 商品目标页信息
     */
    private TargetUrl target_url;
    /**
     * 店铺信息
     */
    private StoreInfo store_info;
    /**
     * 优惠券信息
     */
    private List<CouponInfo> coupon_info;
    /**
     * 评论信息
     */
    private CommentInfo comment_info;
    /**
     * 商家标记商品已删除；0：未删除，1：已删除，为空默认为0
     */
    private Integer is_deleted;

}
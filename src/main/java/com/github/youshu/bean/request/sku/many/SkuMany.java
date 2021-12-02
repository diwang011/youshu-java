package com.github.youshu.bean.request.sku.many;

import com.github.youshu.bean.request.sku.CommentInfo;
import com.github.youshu.bean.request.sku.DescInfo;
import com.github.youshu.bean.request.sku.MediaInfo;
import com.github.youshu.bean.request.sku.SalesInfo;
import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class SkuMany {

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
     * 商品图片url列表 数组最大长度 10
     */
    private List<MediaInfo> img_urls;
    /**
     * 商品属性
     */
    private ProductProps product_props;
    /**
     * 商品销售信息
     * 必填
     */
    private SalesInfo sales_props;
    /**
     * 商品描述信息
     * 必填
     */
    private DescInfo desc_props;
    /**
     * 客户侧的商品创建时间，unix时间戳，字段长度为 13 字节
     * 必填
     */
    private String external_created_time;
    /**
     * 评论信息
     */
    private CommentInfo comment_info;
}
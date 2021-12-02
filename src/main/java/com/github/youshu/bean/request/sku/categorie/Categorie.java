package com.github.youshu.bean.request.sku.categorie;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/12/2 15:48
 */
@Data
public class Categorie {
    /**
     * 您为商品类目分配的唯一 id。一般而言，是您在商品库为该商品类目分配的 id。 字段长度最小 1 字节，长度最大 255 字节
     * 必填
     */
    private String external_category_id;
    /**
     * 类目名称 字段长度最小 1 字节，长度最大 255 字节
     * 必填
     */
    private String category_name;
    /**
     * 类目类型，1：前台类目；2：后台类目
     * 必填
     */
    private Integer category_type;
    /**
     * 类目层级
     * 必填
     */
    private Integer category_level;
    /**
     * 父类目 id，顶级类目填 0 字段长度最小 1 字节，长度最大 255 字节
     * 必填
     */
    private String external_parent_category_id;
    /**
     * 是否为根节点，true：是；false：不是
     * 必填
     */
    private Boolean is_root;
    /**
     * 商家标记商品类目信息已删除，0：未删除；1：已删除，为空默认为 0
     */
    private Integer is_deleted;
}

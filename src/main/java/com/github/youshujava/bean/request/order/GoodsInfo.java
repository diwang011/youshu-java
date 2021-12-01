/**
 * Copyright 2021 bejson.com
 */
package com.github.youshujava.bean.request.order;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class GoodsInfo {
    /**
     * sku 编号
     * 必填
     */
    private String external_sku_id;
    /**
     * 商品主图
     */
    private String primary_image_url;
    /**
     * sku 名称
     * 必填
     */
    private String sku_name_chinese;
    /**
     * 单件商品原价，单位默认为元
     * 必填
     */
    private Float goods_amount;
    /**
     * 多件商品实付金额（分摊了优惠的金额）,单位默认为元，注：有数GMV计算使用该字段
     * 必填
     */
    private Float payment_amount;
    /**
     * 是否赠品，0代表非赠品，1代表赠品
     */
    private Integer is_gift;
    /**
     * sku 所属 spu 编号，若无 spu，传输内容请与 external_sku_id 保持一致
     * 必填
     */
    private String external_spu_id;
    /**
     * spu 名称，若无 spu，传输内容请与 sku_name_chinese 保持一致
     * 必填
     */
    private String spu_name_chinese;
    /**
     * 商品售卖单位
     */
    private String sale_unit;
    /**
     * 末级类目 id
     */
    private String category_id;
    /**
     * 末级类目名称
     */
    private String category_name;
    /**
     * 商品数量
     * 必填
     */
    private Integer goods_num;
    /**
     * 商品重量，单位默认为克
     */
    private Float goods_weight;
    /**
     * 主订单销售门店信息
     */
    private StoreInfo store_info;
    /**
     * 主订单来源渠道，数组类型
     */
    private List<ChanInfo> chan_info;
    /**
     * 佣金，json字符串
     */
    private List<CommissionInfo> commission_info;

}
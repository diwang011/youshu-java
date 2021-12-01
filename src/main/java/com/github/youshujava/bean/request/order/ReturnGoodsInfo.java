package com.github.youshujava.bean.request.order;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class ReturnGoodsInfo {
    /**
     * sku 编号
     * 必填
     */
    private String external_sku_id;
    /**
     * sku 名称
     * 必填
     */
    private String sku_name_chinese;
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
     *  退货商品金额，单位元，两位小数
     * 必填
     */
    private Float return_goods_amount;
    /**
     * 退货商品数量
     * 必填
     */
    private Integer return_goods_num;
}

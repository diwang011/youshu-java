package com.github.youshu.bean.request.sku.store;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class Store {
    /**
     * 您为仓库分配的唯一ID。 一般而言，是您在商品库为该仓库分配的id。 字段长度最小 1 字节，长度最大 32 字节
     * 必填
     */
    private String external_store_id;
    /**
     * 门店类型；1：门店仓（可进行线下购物的门店）；2：前置仓（支持同城配/落地配的仓库；3：电商仓（支持快递配送的仓库
     * 必填
     */
    private Integer type;
    /**
     * 门店经营类型 可固定填写 99：其他
     * 必填
     */
    private Integer business_type;
    /**
     * 运营状态 1：开业；2：关店；3：暂停营业
     * 必填
     */
    private Integer operation_status;
    /**
     * 地址信息
     * 必填
     */
    private LocationInfo location_info;
    /**
     * 基础信息
     * 必填
     */
    private BasicProps basic_props;
    /**
     * 配送信息
     */
    private DeliveryInfo delivery_info;

}
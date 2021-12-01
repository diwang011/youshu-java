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
public class OrderAdd {
    /**
     * 商家订单号
     * 必填
     */
    private String external_order_id;
    /**
     * 订单创建时间，unix时间戳 字段长度为 13 字节
     * 必填
     */
    private String create_time;
    /**
     * 订单来源,枚举值:商家小程序：wxapp；商家app：app；
     * 商家H5：mobileweb；商家pcweb：pcweb；
     * 线下人工pos：offstore_pos_manual；
     * 线下自助收银：offstore_pos_self_help；
     * 其他：other
     * 必填
     */
    private String order_source;
    /**
     * 	订单类型；1：普通订单；2：充值订单；3：消费订单（如停车费）；4:预售订单_预付；5：预售订单_尾款；6：优惠券订单，普通购买商品订单传 1 即可；7：积分订单
     * 必填
     */
    private Integer order_type;
    /**
     * 订单品牌 id
     */
    private String brand_id;
    /**
     * 订单品牌名称
     */
    private String brand_name;
    /**
     * 订单商品总数量
     * 必填
     */
    private Integer goods_num_total;
    /**
     * 订单商品总重量，默认单位为克
     */
    private Float goods_weight;
    /**
     * 商品总金额，单位默认为元 注：已含单品级别优惠的商品金额，如单品直降
     * 必填
     */
    private Float goods_amount_total;
    /**
     * 订单运费，单位默认为元 注：运费为0时，传0.00
     * 必填
     */
    private Float freight_amount;
    /**
     * 订单金额，单位默认为元 注：商品总金额+运费金额=订单金额
     * 必填
     */
    private Float order_amount;
    /**
     * 订单应付金额，单位默认为元 注：订单金额-订单级别的优惠金额（如：订单满减）=订单应付金额
     * 必填
     */
    private Float payable_amount;
    /**
     * 实付金额，单位默认为元 注：订单应付金额-支付优惠金额（如：微信支付优惠、招商银行优惠等）=订单实付金额
     * 必填
     */
    private Float payment_amount;
    /**
     * 主订单状态，1110待支付，1130未支付取消，1140已支付未发货取消，1150已支付待发货，1160已发货，1180销售完成/已收货
     * 必填
     */
    private String order_status;
    /**
     * 	状态变更时间，unix毫秒级时间，如 order_status状态为 1150 ，则传 1150（已支付待发货）状态变更的时间
     * 必填
     */
    private String status_change_time;
    /**
     * 用户信息，
     * 必填
     */
    private UserInfo user_info;
    /**
     * 主订单商品信息，数组类型，每个sku存一个数组单位
     * 必填
     */
    private List<GoodsInfo> goods_info;
    /**
     * 主订单用到的券信息，数组类型
     */
    private List<CouponInfo> coupon_info;
    /**
     * 主订单用到的活动信息，数组类型
     */
    private List<PromotionInfo> promotion_info;
    /**
     * 主订单每种支付方式的支付信息,order_status = 1110时 payment_info非必填，其他状态码必填
     */
    private List<PaymentInfo> payment_info;
    /**
     * 快递信息
     */
    private ExpressInfo express_info;
    /**
     * 发票信息，类型为数组
     */
    private List<InvoiceInfo> invoice_info;
    /**
     * 订单赠送总积分
     */
    private Float poIntegers_total;
    /**
     * 商家标记订单已删除，0：未删除；1：已删除，为空默认为 0
     */
    private Integer is_deleted;


}
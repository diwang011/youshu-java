/**
 * Copyright 2021 bejson.com
 */
package com.github.youshu.bean.request.order;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class InvoiceInfo {
    /**
     * 是否需要发票，true代表需要，false代表不需要
     */
    private Boolean if_need_invoice;
    /**
     * 发票类型，枚举值，取值如下： 1000(增值税专用发票) 1001(普通发票) 1002(机动车专用发票) 1003(机打发票) 1004(定额发票 ) 1005(剪开式发票) 1006（其他）
     */
    private String invoice_type;
    /**
     * 发票抬头
     */
    private String invoice_title;
    /**
     * 发票内容
     */
    private String invoice_content;
    /**
     * 发票附加信息
     */
    private String invoice_addition_info;
    /**
     * 公司名称
     */
    private String invoice_company;
    /**
     * 纳税人识别号
     */
    private String invoice_taxpayer;
    /**
     * 注册地址
     */
    private String registry_address;
    /**
     * 注册电话，sha256加密
     */
    private String sha256_registry_phone;
    /**
     * 开户银行
     */
    private String registry_bank_name;
    /**
     * 开户账号
     */
    private String registry_bank_account;
    /**
     *
     */
    private String invoice_delivery_address;
    /**
     *
     */
    private String invoice_delivery_name;
    /**
     * 发票收件人电话，sha256加密
     */
    private String sha256_invoice_delivery_phone;
    /**
     * 发票号码
     */
    private String invoice_num;

}
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
public class ExpressPackageInfo {
    /**
     *物流公司编码，枚举类型，枚举值请参见文章后面的“物流商 code”
     */
    private String express_company_code;
    /**
     *物流公司名称
     */
    private String express_company_name;
    /**
     *运单号
     */
    private String express_code;
    /**
     *发货时间，格式为时间戳 字段长度为 13 字节
     */
    private String ship_time;
    /**
     *	运费跳转页面
     */
    private ExpressPage express_page;
}
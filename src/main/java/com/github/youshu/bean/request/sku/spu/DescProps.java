package com.github.youshu.bean.request.sku.spu;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/12/2 16:31
 */
@Data
public class DescProps {
    /**
     * 商品中文名，字段长度最小1字节，长度最大100字节
     * 必填
     */
    private String product_name_chinese;
}

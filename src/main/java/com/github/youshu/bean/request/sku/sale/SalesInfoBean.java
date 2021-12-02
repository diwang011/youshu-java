package com.github.youshu.bean.request.sku.sale;

import com.github.youshu.bean.request.YoushuRequest;
import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/12/2 16:04
 */
@Data
public class SalesInfoBean extends YoushuRequest {
    /**
     * 商品库存价格列表 数组最大长度 50
     * 必填
     */
    private List<SalesInfo> salesinfo;
}

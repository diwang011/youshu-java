/**
 * Copyright 2021 bejson.com
 */
package com.github.youshujava.bean.request.sku;

import com.github.youshujava.bean.request.YoushuRequest;
import lombok.Data;
import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class SkuBean extends YoushuRequest {
    /**
     * 商品SKU列表 数组最大长度 50
     * 必填
     */
    private List<Sku> skus;
}
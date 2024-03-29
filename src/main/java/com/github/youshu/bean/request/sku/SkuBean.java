package com.github.youshu.bean.request.sku;

import com.github.youshu.bean.request.YoushuRequest;
import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class SkuBean<T> extends YoushuRequest {
    /**
     * 商品SKU列表 数组最大长度 50
     * 必填
     */
    private List<T> skus;
}
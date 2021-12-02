package com.github.youshu.bean.request.sku.spu;

import com.github.youshu.bean.request.YoushuRequest;
import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/12/2 16:29
 */
@Data
public class SpusBean extends YoushuRequest {
    /**
     * 商品SPU列表 数组最大长度 50
     * 必填
     */
    private List<Spus> spus;
}

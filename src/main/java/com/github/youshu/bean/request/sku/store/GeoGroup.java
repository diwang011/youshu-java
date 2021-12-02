package com.github.youshu.bean.request.sku.store;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class GeoGroup {
    /**
     * 坐标点信息，range_type=3时必填
     */
    private List<Geos> geos;

}
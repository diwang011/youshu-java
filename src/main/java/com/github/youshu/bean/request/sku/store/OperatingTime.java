package com.github.youshu.bean.request.sku.store;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class OperatingTime {
    /**
     * 日期区间，例：周一至周日，若填写了`time_zone`则必填；字段长度最小 1 字节，长度最大 64 字节
     */
    private String date_zone;
    /**
     * 时间区间，例：10:00-22:00，若填写了`date_zone`则必填；字段长度最小 1 字节，长度最大 64 字节
     */
    private String time_zone;

}
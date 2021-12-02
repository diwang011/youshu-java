package com.github.youshu.bean.request.sku.store;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class BasicProps {
    /**
     * 店仓名称建议格式：品牌名称（XX店） 字段长度最小 1 字节，长度最大 32 字节
     * 必填
     */
    private String name;
    /**
     * 店仓开业时间 时间戳 毫秒 字段长度为长度为 13 字节
     */
    private String opening_time;
    /**
     * 为空默认周一至周日，10:00-22:00
     */
    private List<OperatingTime> operating_time;

}
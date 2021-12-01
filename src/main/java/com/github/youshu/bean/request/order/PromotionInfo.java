package com.github.youshu.bean.request.order;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 13:56
 */
@Data
public class PromotionInfo {
    /**
     * 活动类型；1：会员价；2：其他活动
     */
    private Integer promotion_type;
    /**
     * 该类活动的细节券信息
     */
    private List<PromotionDetail> promotion_detail;
}

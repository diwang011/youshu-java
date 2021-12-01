package com.github.youshu.bean.request.order;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 14:04
 */
@Data
public class PromotionDetail {
    /**
     * 订单中有使用的活动ID
     */
    private String external_promotion_id;
    /**
     * 活动名称
     */
    private String promotion_name;
    /**
     * 分摊至该订单的活动折扣金额，单位默认为元
     */
    private String promotion_amount;
}

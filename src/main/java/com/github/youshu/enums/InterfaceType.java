package com.github.youshu.enums;

public enum InterfaceType {
    GET_DATA_SOURCE,
    ADD_DATA_SOURCE,
    ADD_ORDER,
    UPDATE_ORDER,
    ADD_ORDER_SUM,
    RETURN_ORDER,
    ADD_SKU,
    UPDATE_SKU,
    ADD_WXAPP_VISIT_PAGE,
    ADD_PRODUCT_CATEGORIES,
    ADD_SALESINFO,
    ADD_SPUS,
    ADD_SKU_MANY,
    ADD_STORE,
    ADD_SKU_COMMENT,
    ADD_USER,
    ADD_USER_GROUP_CHAT_TAG,
    ADD_PROMOTION,
    ADD_COUPON,
    ADD_WXAPP_DAILY_VISIT_TREND,
    ADD_WXAPP_VISIT_DISTRIBUTION,
    ;

    public static String getAddress(InterfaceType interfaceType) {
        switch (interfaceType) {
            case GET_DATA_SOURCE:
                return "/data-api/v1/data_source/get";
            case ADD_DATA_SOURCE:
                return "/data-api/v1/data_source/add";
            case ADD_ORDER:
                return "/data-api/v1/order/add_order";
            case UPDATE_ORDER:
                return "/data-api/v1/order/update";
            case ADD_ORDER_SUM:
                return "/data-api/v1/order/add_order_sum";
            case RETURN_ORDER:
                return "/data-api/v1/return_order/add";
            case ADD_SKU:
                return "/data-api/v1/sku_info/add";
            case UPDATE_SKU:
                return "/data-api/v1/sku_info/update";
            case ADD_WXAPP_VISIT_PAGE:
                return "/data-api/v1/analysis/add_wxapp_visit_page";
            case ADD_PRODUCT_CATEGORIES:
                return "/data-api/v1/product_categories/add";
            case ADD_SALESINFO:
                return "/data-api/v1/salesinfo/add";
            case ADD_SPUS:
                return "/data-api/v1/spus/add";
            case ADD_SKU_MANY:
                return "/data-api/v1/sku/add";
            case ADD_STORE:
                return "/data-api/v1/store/add";
            case ADD_SKU_COMMENT:
                return "/data-api/v1/sku_comment/add";
            case ADD_USER:
                return "/data-api/v1/user/add_user";
            case ADD_USER_GROUP_CHAT_TAG:
                return "/data-api/v1/user/group_chat_tag/add";
            case ADD_PROMOTION:
                return "/data-api/v1/order/add_promotion";
            case ADD_COUPON:
                return "/data-api/v1/order/add_coupon";
            case ADD_WXAPP_DAILY_VISIT_TREND:
                return "/data-api/v1/analysis/add_wxapp_daily_visit_trend";
            case ADD_WXAPP_VISIT_DISTRIBUTION:
                return "/data-api/v1/analysis/add_wxapp_visit_distribution";
            default:
                return "";
        }
    }
}

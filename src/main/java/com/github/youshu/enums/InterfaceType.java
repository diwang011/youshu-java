package com.github.youshu.enums;

public enum InterfaceType {
    GET_DATA_SOURCE, ADD_DATA_SOURCE, ADD_ORDER, UPDATE_ORDER,ADD_ORDER_SUM,RETURN_ORDER,ADD_SKU,UPDATE_SKU,ADD_WXAPP_VISIT_PAGE;

    public static String getAddress(InterfaceType interfaceType) {
        switch (interfaceType.name()) {
            case "GET_DATA_SOURCE":
                return "/data-api/v1/data_source/get";
            case "ADD_DATA_SOURCE":
                return "/data-api/v1/data_source/add";
            case "ADD_ORDER":
                return "/data-api/v1/order/add_order";
            case "UPDATE_ORDER":
                return "/data-api/v1/order/update";
            case "ADD_ORDER_SUM":
                return "/data-api/v1/order/add_order_sum";
            case "RETURN_ORDER":
                return "/data-api/v1/return_order/add";
            case "ADD_SKU":
                return "/data-api/v1/sku_info/add";
            case "UPDATE_SKU":
                return "/data-api/v1/sku_info/update";
            case "ADD_WXAPP_VISIT_PAGE":
                return "/data-api/v1/analysis/add_wxapp_visit_page";
            default:
                return "";
        }
    }
}

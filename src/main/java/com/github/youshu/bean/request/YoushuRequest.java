package com.github.youshu.bean.request;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 13:48
 */
@Data
public class YoushuRequest {
    /**
     * 数据源id（create方法返回的data.dataSource.id）
     * 必填，如在配置文件配置，可不填
     * 配置大于传参
     */
    private String dataSourceId;
}

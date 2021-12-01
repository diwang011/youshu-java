package com.github.youshu.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 15:45
 */
@Data
@ConfigurationProperties(prefix = "youshu")
public class YoushuProperties {
    private String app_id;
    private String app_secret;
    private String merchantId;
    private String dataSourceId;
    private String environment;//SANDBOX,PRODUCTION

}

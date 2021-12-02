package com.github.youshu.config;

import com.github.youshu.service.YoushuApi;
import com.github.youshu.service.impl.YoushuApiImpl;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 15:45
 */
@Configuration
@EnableConfigurationProperties(YoushuProperties.class)
@AllArgsConstructor
public class YoushuConfiguration {
    private final YoushuProperties properties;

    @Bean
    @Primary
    public YoushuApi youshuApi() {
        return new YoushuApiImpl(properties);
    }
}

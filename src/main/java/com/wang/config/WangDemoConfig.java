package com.wang.config;

import com.wang.properties.WangDemoProperties;
import com.wang.service.WangDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(WangDemoProperties.class)
public class WangDemoConfig {

    @Autowired
    private WangDemoProperties wangDemoProperties;

    @Bean(name = "demo")
    public WangDemoService demoService() {
        return new WangDemoService(wangDemoProperties.getAppName());
    }
}

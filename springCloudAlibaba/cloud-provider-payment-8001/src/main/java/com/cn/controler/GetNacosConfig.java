package com.cn.controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 支持Nacos的动态刷新功能
public class GetNacosConfig {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/get/config")
    public String getConfigInfo() {
        return this.configInfo;
    }
}
package com.kiran4dev.configdemo.models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;

@Configuration
@ConfigurationProperties(prefix = "build")
@Data
@ToString
@RefreshScope
public class BuildInfo {

    private String id;
    private String version;
    private String name;
}

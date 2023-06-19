package com.example.kotlinndemo.config

import lombok.Getter
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration


@ConfigurationProperties(prefix = "app.config")
@Configuration
@Getter
data class AppConfig(
        var name: String?,
        var port: String?
)
package com.lucasdev.offerapiservice.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${offer-query.base-url}")
    private String baseUrl;

    @Bean
    public WebClient webClientConfig(WebClient.Builder builder) {
        return builder.baseUrl(baseUrl).build();
    }
}

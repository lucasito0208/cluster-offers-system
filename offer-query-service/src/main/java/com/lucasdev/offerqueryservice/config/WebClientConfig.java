package com.lucasdev.offerqueryservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${offer.ingest.url}")
    private String baseUrl;

    @Bean
    public WebClient offerDigestWebClient() {
        return WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }
}

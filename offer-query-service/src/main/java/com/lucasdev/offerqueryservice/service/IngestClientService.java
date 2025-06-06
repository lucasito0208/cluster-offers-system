package com.lucasdev.offerqueryservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class IngestClientService {

    private final WebClient webClient;

    public IngestClientService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> getResponse() {
        return webClient.get()
                .uri("http://localhost:8080/ingest/health")
                .retrieve()
                .bodyToMono(String.class);
    }
}

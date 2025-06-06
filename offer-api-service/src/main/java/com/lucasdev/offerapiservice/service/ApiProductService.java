package com.lucasdev.offerapiservice.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucasdev.offerapiservice.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApiProductService {

    private final WebClient client;

    private final ObjectMapper mapper;

    @Value("${offer-query.base-url}")
    private String offerQueryBaseUrl;

   /*
    @GetMapping("/api/productos")
    public Mono<ResponseEntity<List<ProductDto>>> fetchAllProducts() {
        return client.get()
                .uri(offerQueryBaseUrl+"/productos/queries/listar")
                .retrieve()
                .bodyToFlux(ProductDto.class)
                .collectList()
                .map(ResponseEntity::ok);
    }
    */

    // Devolver todos los productos
    public Mono<List<ProductDto>> listProducts() {
        return client
                .get()
                .uri(offerQueryBaseUrl+"/productos/queries/listar")
                .retrieve()
                .bodyToFlux(ProductDto.class)
                .collectList();
    }



}

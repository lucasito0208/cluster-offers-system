package com.lucasdev.offerapiservice.controller;

import com.lucasdev.offerapiservice.dto.ProductDto;
import com.lucasdev.offerapiservice.service.ApiProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ApiProductService apiProductService;
    /*
    public ResponseEntity<Mono<List<ProductDto>>> listarProductos() {
        return ResponseEntity.ok(apiProductService.listProducts());
    }
    */


    public Mono<ResponseEntity<List<ProductDto>>> listarProductos() {
        return apiProductService.listProducts().map(ResponseEntity::ok);
    }
}

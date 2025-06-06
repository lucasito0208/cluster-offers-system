package com.lucasdev.offerqueryservice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucasdev.offerqueryservice.dto.ProductDto;
import com.lucasdev.offerqueryservice.model.Product;
import com.lucasdev.offerqueryservice.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productos/queries/")
public class ProductoController {

    private final ProductoService productoService;
    private final ObjectMapper mapper;

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of("service", "offer-query-service", "status", "OK");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> obtenerProducto(@PathVariable String id) {
        return productoService.getProductosRelacionados(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/listar")
    public ResponseEntity<List<ProductDto>> listar() {
        List<Product> productos = productoService.getAllProducts();
        List<ProductDto> productosDtos = productos
                .stream()
                .map(producto -> mapper.convertValue(producto, ProductDto.class))
                .toList();
        return ResponseEntity.ok(productosDtos);
    }
}

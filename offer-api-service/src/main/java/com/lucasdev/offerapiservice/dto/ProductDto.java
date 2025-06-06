package com.lucasdev.offerapiservice.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ProductDto {

    private String productId;
    private String nombre;
    private String categoria;
    private Double precio;
    private String promo;
    private List<ProductRelatedDto> productosRelacionados;
}

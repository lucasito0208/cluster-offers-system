package com.lucasdev.offerapiservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ProductRelatedDto {

    private String relatedId;
    private String nombre;
}

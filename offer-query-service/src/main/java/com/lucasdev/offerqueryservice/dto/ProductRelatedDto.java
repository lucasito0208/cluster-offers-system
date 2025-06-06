package com.lucasdev.offerqueryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRelatedDto {

    private String relatedId;
    private String nombre;
}

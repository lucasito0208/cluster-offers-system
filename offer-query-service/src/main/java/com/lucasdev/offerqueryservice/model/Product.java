package com.lucasdev.offerqueryservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node("Product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private String productId;
    private String productoNombre;
    private String categoria;
    private Double precio;
    private String promo;

    @Relationship(type = "RELATED_WITH", direction = Relationship.Direction.OUTGOING)
    private List<Product> productosRelacionados;

}

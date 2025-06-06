package com.lucasdev.offeringestservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node("Product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private String productId;
    private String productName;
    private String category;
    private double price;
    private String promotion;

    @Relationship(type="OFFERS", direction=Relationship.Direction.INCOMING)
    private Brand brand;
}

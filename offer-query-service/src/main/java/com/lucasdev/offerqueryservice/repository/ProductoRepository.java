package com.lucasdev.offerqueryservice.repository;

import com.lucasdev.offerqueryservice.model.Product;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends Neo4jRepository<Product, String> {

    @Query("MATCH (p:Product) WHERE p.productId = $productId RETURN p")
    Optional<Product> findByProductId(String productId);

}

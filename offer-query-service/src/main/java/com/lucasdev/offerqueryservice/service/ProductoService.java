package com.lucasdev.offerqueryservice.service;

import com.lucasdev.offerqueryservice.model.Product;
import com.lucasdev.offerqueryservice.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Dame los productos relacionados
    public Optional<Product> getProductosRelacionados(String productoId) {
        return productoRepository.findByProductId(productoId);
    }

    public List<Product> getAllProducts() {
        return productoRepository.findAll();
    }

}

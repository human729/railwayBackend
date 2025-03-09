package com.example.backend.service;

import com.example.backend.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto getProductById(Long id);

    List<ProductDto> getAllProducts();
}

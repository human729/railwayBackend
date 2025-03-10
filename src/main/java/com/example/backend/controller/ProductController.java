package com.example.backend.controller;

import com.example.backend.dto.ProductDto;
import com.example.backend.entity.Product;
import com.example.backend.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable("product_id") Long id) {
        ProductDto productDto = service.getProductById(id);
        return ResponseEntity.ok(productDto);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        List<ProductDto> products = service.getAllProducts();
        return ResponseEntity.ok(products);
    }
}

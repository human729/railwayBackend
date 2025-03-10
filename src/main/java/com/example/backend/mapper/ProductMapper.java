package com.example.backend.mapper;

import com.example.backend.dto.ProductDto;
import com.example.backend.entity.Product;

public class ProductMapper {
    public static ProductDto mapToProductDto(Product product) {
        return new ProductDto(
                product.getProduct_id(),
                product.getName(),
                product.getDesc(),
                product.getMeasure()
        );
    }

    public static Product mapToProduct(ProductDto productDto) {
        return new Product(
                productDto.getId(),
                productDto.getName(),
                productDto.getDesc(),
                productDto.getMeasure()
        );

    }
}

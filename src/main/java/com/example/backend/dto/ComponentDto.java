package com.example.backend.dto;

import com.example.backend.entity.Product;
import com.example.backend.entity.Recipe;

public class ComponentDto {
    long id;
    Product product;
    Recipe recipe;
    int count;

    public ComponentDto() {}

    public ComponentDto(long id, Product product, Recipe recipe, int count) {
        this.id = id;
        this.product = product;
        this.recipe = recipe;
        this.count = count;
    }

    public long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setId(long id) {
        this.id = id;
    }
}

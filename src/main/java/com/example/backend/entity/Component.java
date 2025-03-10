package com.example.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Components")
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Recipe recipe;

    @Column
    private int count;

    public Component() {};

    public Component(Long id, Product product, Recipe recipe, int count) {
        this.id = id;
        this.product = product;
        this.recipe = recipe;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public Product getProduct() {
        return product;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}

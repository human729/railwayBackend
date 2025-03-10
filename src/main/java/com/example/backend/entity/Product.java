package com.example.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String desc;

    @Column
    private String measure;

    public Product() {}

    public Product(long product_id, String name, String desc, String measure) {
        this.id = product_id;
        this.name = name;
        this.desc = desc;
        this.measure = measure;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getMeasure() {
        return measure;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.backend.dto;

public class ProductDto {
    long id;
    String name;
    String desc;
    String measure;

    public ProductDto() {}

    public ProductDto(long id, String name, String desc, String measure) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.measure = measure;
    }

    public String getMeasure() {
        return measure;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }
}

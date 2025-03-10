package com.example.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "recipe_name")
    private String recpName;

    @Column
    private String cookingTime;

    @Column(name = "recipe_description")
    private String recpDescription;

    @Column
    private int calorie;

    @Column
    private int protein;

    @Column
    private int fats;

    @Column
    private int carbohydrate;

    public Recipe() {};

    public Recipe(long id, String name, String cookingTime, String recpDescription, int calorie, int protein, int fats, int carbohydrate) {
        this.id = id;
        recpName = name;
        this.cookingTime = cookingTime;
        this.recpDescription = recpDescription;
        this.calorie = calorie;
        this.protein = protein;
        this.fats = fats;
        this.carbohydrate = carbohydrate;
    }

    public long getId() {
        return id;
    }

    public String getRecpName() {
        return recpName;
    }

    public String getRecpDescription() {
        return recpDescription;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public int getCalorie() {
        return calorie;
    }

    public int getProtein() {
        return protein;
    }

    public int getFats() {
        return fats;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public void setCookingTime(String cookingTime) {
        cookingTime = cookingTime;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRecpDescription(String recpDescription) {
        this.recpDescription = recpDescription;
    }

    public void setRecpName(String recpName) {
        this.recpName = recpName;
    }
}

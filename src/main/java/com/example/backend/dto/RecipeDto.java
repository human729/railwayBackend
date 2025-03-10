package com.example.backend.dto;

public class RecipeDto {
    long recipe_id;
    String recpName;
    String cookingTime;
    String recpDescription;
    int calorie;
    int protein;
    int fats;
    int carbohydrate;

    public RecipeDto() {};

    public RecipeDto(long recipe_id, String recpName, String cookingTime, String recpDescription, int calorie, int protein, int fats, int carbohydrate) {
        this.recipe_id = recipe_id;
        this.recpName = recpName;
        this.cookingTime = cookingTime;
        this.recpDescription = recpDescription;
        this.calorie = calorie;
        this.protein = protein;
        this.fats = fats;
        this.carbohydrate = carbohydrate;
    }

    public long getRecipe_id() {
        return recipe_id;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public int getFats() {
        return fats;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public int getProtein() {
        return protein;
    }

    public String getRecpName() {
        return recpName;
    }

    public String getRecpDescription() {
        return recpDescription;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setRecipe_id(long recipe_id) {
        this.recipe_id = recipe_id;
    }

    public void setRecpDescription(String recpDescription) {
        this.recpDescription = recpDescription;
    }

    public void setRecpName(String recpName) {
        this.recpName = recpName;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}

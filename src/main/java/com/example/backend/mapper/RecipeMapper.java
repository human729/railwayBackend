package com.example.backend.mapper;

import com.example.backend.dto.RecipeDto;
import com.example.backend.entity.Recipe;

public class RecipeMapper {
    public static RecipeDto mapToRecipeDto(Recipe recipe) {
        return new RecipeDto(
                recipe.getId(),
                recipe.getRecpName(),
                recipe.getCookingTime(),
                recipe.getRecpDescription(),
                recipe.getCalorie(),
                recipe.getProtein(),
                recipe.getFats(),
                recipe.getCarbohydrate()
        );
    }

    public static Recipe mapToRecipe(RecipeDto recipeDto) {
        return new Recipe(
                recipeDto.getId(),
                recipeDto.getRecpName(),
                recipeDto.getCookingTime(),
                recipeDto.getRecpDescription(),
                recipeDto.getCalorie(),
                recipeDto.getProtein(),
                recipeDto.getFats(),
                recipeDto.getCarbohydrate()
        );
    }
}

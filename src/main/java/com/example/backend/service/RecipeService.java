package com.example.backend.service;

import com.example.backend.dto.RecipeDto;

import java.util.List;

public interface RecipeService {
    RecipeDto getRecipeById(long id);

    List<RecipeDto> getAllRecipes();
}

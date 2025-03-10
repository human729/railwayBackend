package com.example.backend.service.impl;

import com.example.backend.dto.RecipeDto;
import com.example.backend.entity.Recipe;
import com.example.backend.exception.ResourceNotFoundException;
import com.example.backend.mapper.RecipeMapper;
import com.example.backend.repository.RecipeRepository;
import com.example.backend.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeServiceImpl implements RecipeService {
    private RecipeRepository repository;

    public RecipeServiceImpl(RecipeRepository repository) {
        this.repository = repository;
    }

    @Override
    public RecipeDto getRecipeById(long id) {
        Recipe recipe = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recipe not exists with given id " + id));
        return RecipeMapper.mapToRecipeDto(recipe);
    }

    @Override
    public List<RecipeDto> getAllRecipes() {
        List<Recipe> recipes = repository.findAll();
        return recipes.stream().map((recipe) -> RecipeMapper.mapToRecipeDto(recipe)).collect(Collectors.toList());
    }
}

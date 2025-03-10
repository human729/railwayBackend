package com.example.backend.controller;

import com.example.backend.dto.ProductDto;
import com.example.backend.dto.RecipeDto;
import com.example.backend.service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {
    private RecipeService service;

    public RecipeController(RecipeService service) {
        this.service = service;
    }

    @GetMapping("{id}")
    public ResponseEntity<RecipeDto> getRecipeById(@PathVariable("recipe_id") Long id) {
        RecipeDto recipeDto = service.getRecipeById(id);
        return ResponseEntity.ok(recipeDto);
    }

    @GetMapping
    public ResponseEntity<List<RecipeDto>> getAllRecipes() {
        List<RecipeDto> recipes = service.getAllRecipes();
        return ResponseEntity.ok(recipes);
    }
}

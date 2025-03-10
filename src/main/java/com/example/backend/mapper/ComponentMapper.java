package com.example.backend.mapper;

import com.example.backend.dto.ComponentDto;
import com.example.backend.entity.Component;

public class ComponentMapper {
    public static ComponentDto mapToComponentDto(Component component) {
        return new ComponentDto(
                component.getId(),
                component.getProduct(),
                component.getRecipe(),
                component.getCount()
        );
    }

    public static Component mapToComponent(ComponentDto componentDto) {
        return new Component(
                componentDto.getId(),
                componentDto.getProduct(),
                componentDto.getRecipe(),
                componentDto.getCount()
        );
    }
}

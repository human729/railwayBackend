package com.example.backend.service;

import com.example.backend.dto.ComponentDto;

import java.util.List;

public interface ComponentService {
    ComponentDto getComponentById(Long id);

    List<ComponentDto> getAllComponents();
}

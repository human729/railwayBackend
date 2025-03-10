package com.example.backend.service.impl;

import com.example.backend.dto.ComponentDto;
import com.example.backend.entity.Component;
import com.example.backend.exception.ResourceNotFoundException;
import com.example.backend.mapper.ComponentMapper;
import com.example.backend.repository.ComponentRepository;
import com.example.backend.service.ComponentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComponentServiceImpl implements ComponentService {
    private ComponentRepository repository;

    public ComponentServiceImpl(ComponentRepository repository) {
        this.repository = repository;
    }

    @Override
    public ComponentDto getComponentById(Long id) {
        Component component = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Component not exists with given id " + id));
        return ComponentMapper.mapToComponentDto(component);
    }

    @Override
    public List<ComponentDto> getAllComponents() {
        List<Component> components = repository.findAll();
        return components.stream().map((component) -> ComponentMapper.mapToComponentDto(component)).collect(Collectors.toList());
    }
}

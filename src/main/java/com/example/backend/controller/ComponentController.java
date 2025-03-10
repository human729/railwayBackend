package com.example.backend.controller;

import com.example.backend.dto.ComponentDto;
import com.example.backend.service.ComponentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ComponentController {
    private ComponentService service;

    public ComponentController(ComponentService service) { this.service = service; }

    @GetMapping("{id}")
    public ResponseEntity<ComponentDto> getComponentById(@PathVariable("id") Long id) {
        ComponentDto componentDto = service.getComponentById(id);
        return ResponseEntity.ok(componentDto);
    }

    @GetMapping
    public ResponseEntity<List<ComponentDto>> getAllComponents() {
        List<ComponentDto> components = service.getAllComponents();
        return ResponseEntity.ok(components);
    }
}

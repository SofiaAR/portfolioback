package com.sofia.portfolio.controller;

import com.sofia.portfolio.dto.ProjectRequest;
import com.sofia.portfolio.dto.ProjectResponse;
import com.sofia.portfolio.service.ProjectService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


import java.net.URI;
import java.util.List;

@Tag(name = "Projects", description = "Operaciones relacionadas con proyectos del portafolio")
@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @Operation(summary = "Obtener todos los proyectos")
    @GetMapping
    public ResponseEntity<List<ProjectResponse>> list() {
        return ResponseEntity.ok(service.findAll());
    }

    @Operation(summary = "Obtener proyecto por ID")
    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProject(@PathVariable Long id) {
        return ResponseEntity.ok(service.getProjectById(id));
    }

    @Operation(summary = "Crear un nuevo proyecto")
    @PostMapping
    public ResponseEntity<ProjectResponse> create(@Valid @RequestBody ProjectRequest request) {
        ProjectResponse response = service.create(request);
        URI location = URI.create("/api/projects/" + response.getId());
        return ResponseEntity.created(location).body(response);
    }

    @Operation(summary = "Actualizar proyecto")
    @PutMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(
            @PathVariable Long id,
            @Valid @RequestBody ProjectRequest request) {
        return ResponseEntity.ok(service.updateProject(id, request));
    }

    @Operation(summary = "Eliminar proyecto")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        service.deleteProject(id);
        return ResponseEntity.noContent().build();
    }

    
}


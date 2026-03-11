package com.sofia.portfolio.service;

import com.sofia.portfolio.domain.Project;
import com.sofia.portfolio.dto.ProjectRequest;
import com.sofia.portfolio.dto.ProjectResponse;
import com.sofia.portfolio.exception.ResourceNotFoundException;
import com.sofia.portfolio.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public List<ProjectResponse> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    public ProjectResponse getProjectById(Long id) {
        Project project = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found"));

        return mapToResponse(project);
    }

    public ProjectResponse create(ProjectRequest request) {
        Project project = Project.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .repoUrl(request.getRepoUrl())
                .liveUrl(request.getLiveUrl())
                .build();

        Project saved = repository.save(project);

        return mapToResponse(saved);
    }

    public ProjectResponse updateProject(Long id, ProjectRequest request) {
        Project project = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found"));

        project.setTitle(request.getTitle());
        project.setDescription(request.getDescription());
        project.setRepoUrl(request.getRepoUrl());
        project.setLiveUrl(request.getLiveUrl());

        Project updated = repository.save(project);

        return mapToResponse(updated);
    }

    public void deleteProject(Long id) {
        Project project = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found"));

        repository.delete(project);
    }

    private ProjectResponse mapToResponse(Project project) {
        return ProjectResponse.builder()
                .id(project.getId())
                .title(project.getTitle())
                .description(project.getDescription())
                .repoUrl(project.getRepoUrl())
                .liveUrl(project.getLiveUrl())
                .createdAt(project.getCreatedAt())
                .build();
    }
}
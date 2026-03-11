package com.sofia.portfolio.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

@Getter
@Builder
public class ProjectResponse {

    private Long id;
    private String title;
    private String description;
    private String repoUrl;
    private String liveUrl;
    private Instant createdAt;
}
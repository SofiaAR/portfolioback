package com.sofia.portfolio.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectRequest {
    
    @NotBlank(message = "Title is required")
    @Size(max = 120)
    private String title;

    @Size(max = 500)
    private String description;

    @Size(max = 200)
    private String repoUrl;

    @Size(max = 200)
    private String liveUrl;
    
}

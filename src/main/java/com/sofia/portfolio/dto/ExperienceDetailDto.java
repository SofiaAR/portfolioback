package com.sofia.portfolio.dto;

public class ExperienceDetailDto {
    
    private Long id;
    private String title;
    private String detail;
    private Long experienceId; // Deberia ser experience dto? y no la entidad?

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public Long getExperienceId() {
        return experienceId;
    }
    public void setExperienceId(Long experienceId) {
        this.experienceId = experienceId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    
}

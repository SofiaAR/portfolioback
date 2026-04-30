package com.sofia.portfolio.entities;


import jakarta.persistence.*;

@Entity
public class ExperienceDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String detail;
    @ManyToOne( fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "experience_id")
    private ExperienceEntity experience;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public ExperienceEntity getExperience() {
        return experience;
    }
    public void setExperience(ExperienceEntity experience) {
        this.experience = experience;
    }
    

}

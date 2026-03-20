package com.sofia.portfolio.entities;


import jakarta.persistence.*;

@Entity
public class ExperienceDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String detail;
    @ManyToOne( fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "experience_id")
    private Experience experience;

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
    public Experience getExperience() {
        return experience;
    }
    public void setExperience(Experience experience) {
        this.experience = experience;
    }
    

}

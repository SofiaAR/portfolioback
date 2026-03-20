package com.sofia.portfolio.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class Experience {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate initWork;
    private LocalDate endWork;
    @ManyToOne( fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id")
    private Company company;
    @ManyToOne( fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "person_id")
    private Person person;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getInitWork() {
        return initWork;
    }
    public void setInitWork(LocalDate initWork) {
        this.initWork = initWork;
    }
    public LocalDate getEndWork() {
        return endWork;
    }
    public void setEndWork(LocalDate endWork) {
        this.endWork = endWork;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    

    
}

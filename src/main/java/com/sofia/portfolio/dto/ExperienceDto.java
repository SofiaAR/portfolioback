package com.sofia.portfolio.dto;

import java.time.LocalDate;

public class ExperienceDto {
    
    private Long id;
    private LocalDate initWork;
    private LocalDate endWork;
    private CompanyDto companyDto; // ?? ia recomienda private Long companyId; porq seria malo que vaya todo el objeto? porq tendria q crearlos en el experienceservimpl?
    private PersonDto personDto;

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
    public CompanyDto getCompanyDto() {
        return companyDto;
    }
    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }
    public PersonDto getPersonDto() {
        return personDto;
    }
    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }
   
}

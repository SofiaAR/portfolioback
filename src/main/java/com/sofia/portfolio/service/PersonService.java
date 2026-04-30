package com.sofia.portfolio.service;

import com.sofia.portfolio.dto.PersonDto;

import java.util.List;

public interface PersonService{

    public Long create(PersonDto personDto);

    // traer todas las personas
    List<PersonDto>FindAll();
}

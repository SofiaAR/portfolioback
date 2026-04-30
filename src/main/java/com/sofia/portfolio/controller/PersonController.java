package com.sofia.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sofia.portfolio.dto.PersonDto;
import com.sofia.portfolio.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    public PersonService personService;

    @PostMapping("create")
    public Long create(@RequestBody PersonDto personDto){
        return personService.create(personDto);
    }

    @GetMapping("/allPerson")
    public List<PersonDto> getAllPerson(){
        List<PersonDto> personDtos;
        personDtos = personService.FindAll();
        return personDtos;
    }
}

package com.sofia.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofia.portfolio.dto.PersonDto;
import com.sofia.portfolio.entities.PersonEntity;
import com.sofia.portfolio.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository; // ?? 

    @Override
    public Long create(PersonDto personDto){

        //si persona tiene nombre nulo que retorne 0 

        if(personDto.getEmail() == null) {
            return 0L;
        }
        
        if (personDto.getEmail().isEmpty())
             {
            return 0L; 
        }



        //TODO aqui crearé la nueva persona.

        PersonEntity person  = new PersonEntity();
        person.setName(personDto.getName());
        person.setLastName(personDto.getLastName());
        person.setCarreer(personDto.getCarreer());
        person.setEmail(personDto.getEmail());
        person.setPhoneNumber(personDto.getPhoneNumber());

         PersonEntity createdPerson = personRepository.save(person); //??

        return createdPerson.getId();
    }



    //Traer- implementar todas las personas con personrepository findall y mapper?
    public List<PersonDto> FindAll(){
        List<PersonEntity> personsEntity = personRepository.findAll();
        List<PersonDto> personDtos = new ArrayList<>();

        personsEntity.forEach(personEntity -> {
            PersonDto personDtoFromEntity = convertEntityToDto(personEntity);
            personDtos.add(personDtoFromEntity);
        });

        return personDtos;

        };

    //Transformación de entidad a dto
    private PersonDto convertEntityToDto(PersonEntity personEntity) {
        PersonDto dtoPersonConverted = new PersonDto();

        dtoPersonConverted.setName(personEntity.getName());
        dtoPersonConverted.setLastName(personEntity.getLastName());
        dtoPersonConverted.setCareer(personEntity.getCareer());
        dtoPersonConverted.setEmail(personEntity.getEmail());
        dtoPersonConverted.setPhoneNumber(personEntity.getPhoneNumber());

        return dtoPersonConverted;

    }

}


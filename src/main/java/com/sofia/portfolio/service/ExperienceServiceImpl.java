package com.sofia.portfolio.service;

import java.util.Optional;

import com.sofia.portfolio.dto.ExperienceDto;
import com.sofia.portfolio.dto.PersonDto;
import com.sofia.portfolio.entities.ExperienceEntity;
import com.sofia.portfolio.entities.PersonEntity;
import com.sofia.portfolio.repository.CompanyRepository;
import com.sofia.portfolio.repository.ExperienceRepository;
import com.sofia.portfolio.repository.PersonRepository;

public class ExperienceServiceImpl implements ExperienceService{

    private ExperienceRepository experienceRepository; 
    private PersonRepository personRepository;
    private CompanyRepository companyRepository;
    private PersonService personService;


    @Override
    public Long create(ExperienceDto experienceDto){
      
        ExperienceEntity experience = new ExperienceEntity();
        experience.setInitWork(experienceDto.getInitWork());
        experience.setEndWork(experienceDto.getEndWork());

        PersonDto personDto = new PersonDto();
        personDto.setName("sofia");


        personService.create(personDto);



        Long idPersonita = experienceDto.getPersonDto().getId();
        Optional<PersonEntity> personita = personRepository.findById(idPersonita);

        if(personita.isPresent()) {
            experience.setPerson(personita.get());
        }


    
        


        return 0L;

        

    }



    
}

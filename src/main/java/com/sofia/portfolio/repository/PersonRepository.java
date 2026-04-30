package com.sofia.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sofia.portfolio.entities.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long>{

    

    
}

package com.sofia.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sofia.portfolio.entities.CompanyEntity;


public interface CompanyRepository extends JpaRepository <CompanyEntity, Long> {

    
    
}

package com.sofia.portfolio.service;

import com.sofia.portfolio.dto.CompanyDto;
import com.sofia.portfolio.dto.PersonDto;
import com.sofia.portfolio.entities.CompanyEntity;
import com.sofia.portfolio.entities.PersonEntity;
import com.sofia.portfolio.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Long create(CompanyDto companyDto){
        
        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setName(companyDto.getName());
        companyEntity.setTurn(companyDto.getTurn());

        CompanyEntity createdCompany = companyRepository.save(companyEntity);
        return createdCompany.getId();
    }
    //Buscar todos


    public List<CompanyDto> FindAll() {
        List<CompanyEntity> companies = companyRepository.findAll();
        List<CompanyDto> companyDtos = new ArrayList<>();

        companies.forEach(companyEntity ->{
            CompanyDto companyDtoFromEntity = convertEntityToDto(companyEntity);
            companyDtos.add(companyDtoFromEntity);

        });
        return companyDtos;
    };

    //Transformacion company

private CompanyDto convertEntityToDto(CompanyEntity companyEntity){
        CompanyDto dtoCompanyConverted = new CompanyDto();

        dtoCompanyConverted.setId(companyEntity.getId());
        dtoCompanyConverted.setName(companyEntity.getName());
        dtoCompanyConverted.setTurn(companyEntity.getTurn());

        return dtoCompanyConverted;
}

}

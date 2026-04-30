package com.sofia.portfolio.controller;

import com.sofia.portfolio.dto.CompanyDto;
import com.sofia.portfolio.dto.PersonDto;
import com.sofia.portfolio.service.CompanyService;
import com.sofia.portfolio.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("create")
    public Long create(@RequestBody CompanyDto companyDto){ Long idCompanyCreated = companyService.create(companyDto);
        return idCompanyCreated;
    }


    @GetMapping("/allCompanies")
    public List<CompanyDto> getAllCompany(){
        List<CompanyDto> companiesDtos;
        companiesDtos = companyService.FindAll();
        return companiesDtos;
    }
}

package com.sofia.portfolio.service;

import com.sofia.portfolio.dto.CompanyDto;

import java.util.List;

public interface CompanyService {

    public Long create (CompanyDto companyDto);

    List<CompanyDto>FindAll();

}

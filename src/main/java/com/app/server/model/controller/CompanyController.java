package com.app.server.model.controller;

import com.app.server.model.entity.Company;
import com.app.server.model.entity.Employee;
import com.app.server.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@CrossOrigin("*")
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping()
    public List<Company> getAllEmployee(){
        return companyRepository.findAll();
    }
}



package com.app.server.model.controller;

import com.app.server.model.entity.Company;
import com.app.server.model.entity.Employee;
import com.app.server.repository.CompanyRepository;
import com.app.server.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@CrossOrigin("*")
public class CompanyController {


    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping()
    public List<Company> getAllCompanies(){
        return companyService.getAllEntities();
    }
    @GetMapping("/{id}")
    public Company getAllCompanies(@PathVariable("id") int id){
        return companyService.getEntityById(id);
    }


}



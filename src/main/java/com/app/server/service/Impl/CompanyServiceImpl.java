package com.app.server.service.Impl;

import com.app.server.model.entity.Company;
import com.app.server.repository.CompanyRepository;
import com.app.server.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {



    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    @Override
    public List<Company> getAllEntities() {
        return companyRepository.findAll();
    }

    @Override
    public Company getEntityById(int id) {
        return companyRepository.findById(id).get();
    }

    @Override
    public void deleteEntity(int id) {
        companyRepository.deleteById(id);
    }
}

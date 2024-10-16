package com.app.server.service.Impl;

import com.app.server.model.entity.Company;
import com.app.server.repository.CompanyRepository;
import com.app.server.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl extends BasicServiceImpl<Company> implements CompanyService {



    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        super(companyRepository);
        this.companyRepository = companyRepository;
    }

}

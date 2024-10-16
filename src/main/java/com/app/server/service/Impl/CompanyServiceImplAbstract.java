package com.app.server.service.Impl;

import com.app.server.model.entity.Company;
import com.app.server.repository.CompanyRepository;
import com.app.server.service.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImplAbstract extends AbstractBasicServiceImpl<Company> implements CompanyService {



    private CompanyRepository companyRepository;

    public CompanyServiceImplAbstract(CompanyRepository companyRepository) {
        super(companyRepository);
        this.companyRepository = companyRepository;
    }

}

package com.app.server.service.Impl;

import com.app.server.model.entity.Employee;
import com.app.server.repository.EmployeeDao;
import com.app.server.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplAbstract extends AbstractBasicServiceImpl<Employee> implements EmployeeService{

    private EmployeeDao employeeDao;

    public EmployeeServiceImplAbstract(EmployeeDao employeeDao) {
        super(employeeDao);
        this.employeeDao = employeeDao;
    }


}

package com.app.server.service.Impl;

import com.app.server.model.entity.Employee;
import com.app.server.repository.EmployeeDao;
import com.app.server.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl extends BasicServiceImpl<Employee> implements EmployeeService{

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        super(employeeDao);
        this.employeeDao = employeeDao;
    }


}

package com.app.server.model.controller;


import com.app.server.model.entity.Employee;
import com.app.server.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin("*")
public class EmployeeController {

@Autowired
    private EmployeeDao employeeDao;

@GetMapping("/api")
    public List<Employee> getAllEmployee(){
    return employeeDao.findAll();
}
}

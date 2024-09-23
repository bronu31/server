package com.app.server.model.controller;


import com.app.server.model.entity.Company;
import com.app.server.model.entity.Employee;
import com.app.server.repository.EmployeeDao;
import com.app.server.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("")
    public List<Employee> getAllEmployee(){
    return employeeService.getAllEntities();
}


    @GetMapping("/{id}")
    public Employee getCompany(@PathVariable("id") int id){
        return employeeService.getEntityById(id);
    }
}

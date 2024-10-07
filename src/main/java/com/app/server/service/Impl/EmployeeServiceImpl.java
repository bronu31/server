package com.app.server.service.Impl;

import com.app.server.model.entity.Employee;
import com.app.server.repository.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements com.app.server.service.EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> getAllEntities() {
        return employeeDao.findAll();
    }

    @Override
    public Employee getEntityById(int id) {
        return employeeDao.findById(id).get();
    }

    @Override
    public void deleteEntity(int id) {
        employeeDao.deleteById(id);
    }

    @Override
    public Employee saveEntity(Employee entity) {
        return employeeDao.save(entity);
    }

    @Override
    public Employee createEntity(Employee entity) {
        return saveEntity(entity);
    }
}

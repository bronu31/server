package com.app.server.model.dao;


import com.app.server.model.entity.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class EmployeeDaoImpl{



    public List<Employee> all() {
        return null;
    }


    public Optional<Employee> byId(Long key) {
        return Optional.empty();
    }


    public List<Employee> byIds(Collection<Long> keys) {
        return null;
    }


    public Employee insert(Employee value) {
        return null;
    }


    public int update(Employee value, Long where) {
        return 0;
    }


    public int delete(Long key) {
        return 0;
    }
}

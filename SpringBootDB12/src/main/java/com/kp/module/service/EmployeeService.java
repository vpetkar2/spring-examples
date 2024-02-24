/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.module.service;

import com.kp.module.model.Employee;
import com.kp.module.repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author developer
 */
@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository repository;
    
    public Employee save1() {
        Employee e = new Employee();
        e.setName("Raju");
        e.setSalary(10000);
        repository.save(e);
        return e;
    }
    
    public Employee save2(String name, int salary) {
        Employee e = new Employee();
        e.setName(name);
        e.setSalary(salary);
        repository.save(e);
        return e;
    }
    
    public Employee getRecord(int id) {
        Optional<Employee> op = repository.findById(id);
        if (op.isPresent()) {
            Employee emp = op.get();
            return emp;
        }
        return null;
    }
    
    public List<Employee> getAllEmployee() {
        List<Employee> list = repository.findAll();
        return list;
    }
    
    public Employee deleteRecord(int id) {
        Employee emp = getRecord(id);
        if (emp != null) {
            repository.deleteById(id);
        }
        return emp;
    }
    
    public Employee updateRecord(int id, String name, int salary) {
        Employee emp = getRecord(id);
        if (emp != null) {
            emp.setName(name);
            emp.setSalary(salary);
            repository.save(emp);
        }
        return emp;
    }
}

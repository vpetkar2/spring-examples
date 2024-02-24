/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.module.controller;

import com.kp.module.model.Employee;
import com.kp.module.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author developer
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeService service;
    
    @RequestMapping("save1")
    public Employee addEmp1() {
        Employee e = service.save1();
        return e;
    }
    
    @RequestMapping("save2/{name}/{salary}")
    public Employee addEmp2(@PathVariable String name, @PathVariable int salary) {
        Employee e = service.save2(name,salary);
        return e;
    }
    
    @RequestMapping("get/{id}")
    public Employee getEmp(@PathVariable int id) {
        Employee emp = service.getRecord(id);
        return emp;
    }
    
    @RequestMapping("getall")
    public List<Employee> getAllEmployee() {
        List<Employee> list = service.getAllEmployee();
        return list;
    }
    
    @RequestMapping("delete/{id}")
    public Employee deleteEmployee(@PathVariable int id) {
        Employee emp = service.deleteRecord(id);
        return emp;
    }
    
    @RequestMapping("update/{id}/{name}/{salary}")
    public Employee updateEmployee(@PathVariable int id, @PathVariable String name, @PathVariable int salary) {
        Employee emp = service.updateRecord(id, name, salary);
        return emp;
    }
}

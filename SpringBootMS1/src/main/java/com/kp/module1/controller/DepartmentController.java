/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.module1.controller;

import com.kp.module1.model.Department;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author developer
 */
@RestController
@RequestMapping("department")
public class DepartmentController {
    
    @RequestMapping("get")
    public Department get() {
        
        Department d = new Department();
        d.setName("Production");
        d.setRole("Manager");
        return d;
    }
}

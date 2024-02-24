/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.module2.controller;

import com.kp.module2.model.Department;
import com.kp.module2.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author developer
 */
@RestController
@RequestMapping("user")
public class UserController {
    
    @RequestMapping("get")
    public User get() {
        
        RestTemplate t = new RestTemplate();
        Department d = t.getForObject("http://localhost:8080/department/get", Department.class);
        User u = new User();
        u.setDepartment(d);
        u.setName("Raju");
        return u;
    }
}

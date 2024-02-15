/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.module.controller;

import com.kp.module.model.Person;
import com.kp.module.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author developer
 */
@RestController
@RequestMapping("first")
public class FirstClass {
    
    @Autowired
    private MyService service;

    public FirstClass() {
        System.out.println("In First..");
    }
    
    @RequestMapping("get")
    public Person getData() {
        
        Person p = service.getPerson();
        return p;
    }
}

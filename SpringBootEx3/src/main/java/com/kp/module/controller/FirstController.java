/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.module.controller;

import com.kp.module.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author developer
 */
@RestController
@RequestMapping("person")
public class FirstController {

    public FirstController() {
        System.out.println("In First Constructor...");
    }
    
    @RequestMapping("get")
    public Person getData() {
        Person p = new Person();
        p.setName("Raju");
        p.setAge(23);
        return p;
    }
    
}

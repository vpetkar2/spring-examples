/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.module.controller;

import com.kp.module.model.Person;
import com.kp.module.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author developer
 */
@RestController
@RequestMapping("person")
public class PersonController {
    
    @Autowired
    private PersonService service;
    
    @RequestMapping("save1")
    public Person addPerson() {
        Person p = service.save1();
        return p;
    }
    
    @RequestMapping("save2/{name}/{age}")
    public Person addPerson2(@PathVariable String name, @PathVariable int age) {
        Person p = service.save2(name, age);
        return p;
    }
}

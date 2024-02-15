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
import org.springframework.web.bind.annotation.RequestParam;
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

    public PersonController() {
        System.out.println("In Person Controller..");
    }
    
    @RequestMapping("get1")
    public Person getData1(@RequestParam String name, @RequestParam int age) {
        Person p1 = service.getPerson(name, age);
        return p1;
    }
    
    @RequestMapping("get2/{name}/{age}")
    public Person getData2(@PathVariable String name, @PathVariable int age) {
        Person p1 = service.getPerson(name, age);
        return p1;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.module.service;

import com.kp.module.model.Person;
import com.kp.module.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author developer
 */
@Service
public class PersonService {
    
    @Autowired
    private PersonRepository repository;
    
    public Person save1() {
        Person p = new Person();
        p.setAge(23);
        p.setName("Raju");
        repository.save(p);
        return p;
    }
    
    public Person save2(String name, int age) {
        Person p = new Person();
        p.setAge(age);
        p.setName(name);
        repository.save(p);
        return p;
    }

}

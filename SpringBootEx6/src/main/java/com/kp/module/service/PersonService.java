/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.module.service;

import com.kp.module.model.Person;
import org.springframework.stereotype.Service;

/**
 *
 * @author developer
 */
@Service
public class PersonService {

    public PersonService() {
        System.out.println("In Person Service..");
    }
    
    public Person getPerson(String name, int age) {
        Person p = new Person(name, age);
        return p;
    }
}

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
public class MyService {

    public MyService() {
        System.out.println("My Service..");
    }
    
    public Person getPerson() {
        Person p = new Person("Raju", 23);
        return p;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author developer
 */
@Controller
public class ObjectToJson {

    public ObjectToJson() {
        System.out.println("In ObjectToJson Constructor..");
    }
    
    @RequestMapping("convert")
    public void convertObjectToJsonString() {
        Person p = new Person();
        p.setName("Raju");
        p.setAge(23);
        
        ObjectMap
    }
}

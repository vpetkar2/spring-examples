/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author developer
 */
@RestController
public class DataController {

    public DataController() {
        System.out.println("Data Controller Constructor...");
    }
    
    @RequestMapping("page")
    public ResponseEntity getPage() {
        
        Person p = new Person();
        p.setAge(25);
        p.setName("RaJU");
        
        String json = "";
        
        try {
            ObjectMapper m = new ObjectMapper();
            json = m.writeValueAsString(p);            
        } catch(Exception e) {
            System.out.println("Err" + e);
        }

        return new ResponseEntity(json, HttpStatus.OK);
    }
}

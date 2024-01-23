/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author developer
 */
@RestController
public class StudentController {

    public StudentController() {
        System.out.println("In Student Constructor..");
    }
    
    @RequestMapping("get")
    public ResponseEntity getData() {
        
        Student s = new Student();
        s.setRollno("12345");
        s.setName("Raju");
        s.setChemistry(100);
        s.setMaths(99);
        s.setPhysics(99);
        
        String json = "";
        try {
            ObjectMapper m = new ObjectMapper();
            json = m.writeValueAsString(s);
        } catch(Exception e) {
            System.out.println("Err: - " + e);
        }
        
        ResponseEntity e = new ResponseEntity(json, HttpStatus.OK);
        return e;
    }
}

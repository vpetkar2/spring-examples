/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
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
        System.out.println("In constructor..");
    }
    
    @RequestMapping("get")
    public ResponseEntity getData() {
        
        Student s1 = new Student();
        s1.setName("Raju");
        s1.setRollno("12345");
        s1.setChemistry(100);
        s1.setPhysics(99);
        s1.setMaths(100);
        
        Student s2 = new Student();
        s2.setName("Babli");
        s2.setRollno("12346");
        s2.setChemistry(99);
        s2.setPhysics(100);
        s2.setMaths(100);
        
        Student s3 = new Student();
        s3.setName("Ram");
        s3.setRollno("12347");
        s3.setChemistry(100);
        s3.setPhysics(100);
        s3.setMaths(99);
        
        ArrayList students = new ArrayList();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        String json = "";
        
        try {
            ObjectMapper m = new ObjectMapper();
            json = m.writeValueAsString(students);
        } catch(Exception e) {
            System.out.println("Err" + e);
        }
        
        ResponseEntity e = new ResponseEntity(json, HttpStatus.OK);
        return e;
    }
}

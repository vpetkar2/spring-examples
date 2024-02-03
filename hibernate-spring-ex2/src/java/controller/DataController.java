/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import database.Person;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ResultStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author developer
 */
@RestController
public class DataController {
    
    @RequestMapping("get")
    public ResponseEntity getRecord(@RequestParam int id) {
        
        ObjectMapper mapper = new ObjectMapper();
        try {
            DatabaseService ds = new DatabaseService();
            ResultStatus result = new ResultStatus();
            Person p = ds.selectRecord(id);
            String json = "";
            json = mapper.writeValueAsString(p);
            if (p == null) {
                result.setStatus("No Record Found");
                json = mapper.writeValueAsString(result);
            }
            return (new ResponseEntity(json, HttpStatus.OK));
        } catch(Exception e) {
            System.out.println("Exception : " + e);
            ResultStatus result = new ResultStatus();
            result.setStatus("Error");
            String json = "";
            try {
                json = mapper.writeValueAsString(result);
            } catch (JsonProcessingException ex) {
                Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
            }
            return (new ResponseEntity(json, HttpStatus.OK));
        }
        
    }
    
    @RequestMapping("post")
    public ResponseEntity addRecord(
            @RequestParam String name, 
            @RequestParam int age, 
            @RequestParam String phone) {
        
        ObjectMapper mapper = new ObjectMapper();
        try {
            DatabaseService ds = new DatabaseService();
            int maxId = ds.getMaxId();
            Person p = new Person(maxId, name, age, phone);
            p.setId(maxId + 1);
            ds.insertRecord(p);
            ResultStatus result = new ResultStatus();
            result.setStatus("Success Insert");
            String json = mapper.writeValueAsString(result);
            return (new ResponseEntity(json, HttpStatus.OK));
        } catch(Exception e) {
            System.out.println("Exception : " + e);
            ResultStatus result = new ResultStatus();
            result.setStatus("Error");
            String json = "";
            try {
                json = mapper.writeValueAsString(result);
            } catch (JsonProcessingException ex) {
                Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
            }
            return (new ResponseEntity(json, HttpStatus.OK));
        }
        
    }
    
    @RequestMapping("put")
    public ResponseEntity updateRecord(
            @RequestParam int id,
            @RequestParam String name, 
            @RequestParam int age, 
            @RequestParam String phone) {
        
        ObjectMapper mapper = new ObjectMapper();
        try {
            DatabaseService ds = new DatabaseService();
            ds.updateRecord(id, name, age, phone);
            ResultStatus result = new ResultStatus();
            result.setStatus("Success Update");
            String json = mapper.writeValueAsString(result);
            return (new ResponseEntity(json, HttpStatus.OK));
        } catch(Exception e) {
            System.out.println("Exception : " + e);
            ResultStatus result = new ResultStatus();
            result.setStatus("Error");
            String json = "";
            try {
                json = mapper.writeValueAsString(result);
            } catch (JsonProcessingException ex) {
                Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
            }
            return (new ResponseEntity(json, HttpStatus.OK));
        }
        
    }
    
    @RequestMapping("delete")
    public ResponseEntity deleteRecord(@RequestParam int id) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            DatabaseService ds = new DatabaseService();
            Person p = new Person(id);
            ds.deleteRecord(p);
            ResultStatus result = new ResultStatus();
            result.setStatus("Success Delete");
            String json = mapper.writeValueAsString(result);
            return (new ResponseEntity(json, HttpStatus.OK));
        } catch(Exception e) {
            System.out.println("Exception : " + e);
            ResultStatus result = new ResultStatus();
            result.setStatus("Error");
            String json = "";
            try {
                json = mapper.writeValueAsString(result);
            } catch (JsonProcessingException ex) {
                Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
            }
            return (new ResponseEntity(json, HttpStatus.OK));
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import model.Person;

/**
 *
 * @author developer
 */
public class JSONFIleToObject {

    public JSONFIleToObject() {
        System.out.println("In JSON File to Object Const..");
    }
    
    public static void main(String arg[]) {
        File f = new File("person.json");
        ObjectMapper m = new ObjectMapper();
        try {
            Person p = m.readValue(f, Person.class);
            System.out.println("Name = " + p.getName());
            System.out.println("Age = " + p.getAge());
        } catch (Exception e) {
            System.out.println("Err:- " + e);
        }
    }
}

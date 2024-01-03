/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import model.Person;

/**
 *
 * @author developer
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person p = new Person();
        p.setName("Raju");
        p.setAge(23);
        ObjectMapper m = new ObjectMapper();
        try {
            File f = new File("person.json");
            m.writeValue(f, p);
            System.out.println("Done file");
        }catch(Exception e) {
            System.out.println("e" + e);
        }
        
        
    }
    
}

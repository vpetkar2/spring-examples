/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author developer
 */
@Controller
public class DataController {

    public DataController() {
        System.out.println("In Data Constructor..");
    }
    
    @RequestMapping("page1")
    public ModelAndView getPage1() {
        
        Person person = new Person();
        person.setName("Raju");
        person.setAge(23);
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page1");
        mv.addObject("data", person);
        
        return mv;
    }
    
}

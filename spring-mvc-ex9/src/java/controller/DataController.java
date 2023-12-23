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
    }
    
    @RequestMapping("page1")
    public ModelAndView getPage1() {
        
        Person p = new Person();
        p.setAge(23);
        p.setName("Raju");
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page1");
        mv.addObject("data", p);
        
        return mv;
    }
}

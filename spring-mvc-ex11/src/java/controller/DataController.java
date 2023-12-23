/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    
    @RequestMapping("load")
    public ModelAndView loadForm() {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("form");
        return mv;
    }
    
    @RequestMapping("submit")
    public ModelAndView showData(@ModelAttribute Person p) {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("show");
        mv.addObject("p", p);
        return mv;
    }
}

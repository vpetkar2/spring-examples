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
        System.out.println("In Data Controller..");
        
        int a[] = {2, 5, 7, 10};
        for (int i : a) {
            System.out.println(i);
        }
    }

    @RequestMapping("login")
    public ModelAndView loginForm() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("form");
        return mv;
    }
    
    @RequestMapping("validate")
    public ModelAndView validateCredentials(@ModelAttribute Person p) {

        ModelAndView mv = new ModelAndView();
        if (p.getUsername().equalsIgnoreCase("vishal") && p.getPassword().equalsIgnoreCase("vishal")) {
            mv.setViewName("success");
        } else {
            mv.setViewName("failure");
        }
        
        return mv;
    }
}

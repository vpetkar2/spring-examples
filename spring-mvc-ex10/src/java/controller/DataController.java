/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Student;
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
        System.out.println("In Data Controller Constructor");
    }
    
    @RequestMapping("student-detail")
    public ModelAndView displayStudent() {
        
        Student s = new Student();
        s.setName("Raju");
        s.setRollno("12345");
        s.setChemistry(100);
        s.setMaths(80);
        s.setPhysics(90);
        s.calculate();
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("student");
        mv.addObject("student", s);
        return mv;
    }
}

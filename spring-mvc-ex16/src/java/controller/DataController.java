/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Detail;
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
    }
    
    @RequestMapping("form")
    public ModelAndView loadForm() {
        System.out.println("Form Loaded");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("form");
        return mv;
    }
    
    @RequestMapping("input")
    public ModelAndView converData(@ModelAttribute Detail d) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("show");
        return mv;
    }
}

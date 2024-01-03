/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author developer
 */
@Controller
public class DataController {

    public DataController() {
        System.out.println("IN Data Contrl.. !");
    }
    
    @RequestMapping("show")
    public ModelAndView showId(@RequestParam int id) {
        System.out.println("IN show id method");
        ModelAndView mv = new ModelAndView();
        mv.addObject("Id", id);
        mv.setViewName("show");
        return mv;
    }
}

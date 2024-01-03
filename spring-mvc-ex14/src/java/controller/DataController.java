/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author developer
 */
@Controller
public class DataController {

    public DataController() {
    }
    
    @RequestMapping("data")
    public void getData() {
        System.out.println("I am in method...");
    }
}

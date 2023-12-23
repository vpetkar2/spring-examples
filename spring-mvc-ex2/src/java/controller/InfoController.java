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
public class InfoController {
    
    @RequestMapping("page1")
    public void show1() {
        System.out.println("This is from show 1");
    }
    
    @RequestMapping("page2")
    public void show2() {
        System.out.println("This is from show 2");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author developer
 */
@Controller
public class SecurityController {
    
    public SecurityController() {
        System.out.println("In Security Controller");
    }
    
    @RequestMapping("validate")
    public void validate() {
        System.out.println("In Validate Function...");
    }
    
}

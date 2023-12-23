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
public class LoginController {
    
    public LoginController() {
        System.out.println("In Login Controller");
    }
    
    @RequestMapping("register")
    public void signup() {
        System.out.println("In Sign Up Method...");
    }

}

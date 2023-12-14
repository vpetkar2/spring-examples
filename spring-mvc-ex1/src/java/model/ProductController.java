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
public class ProductController {
    
    public ProductController() {
        System.out.println("I am in Product Controller.");
    }
    
    @RequestMapping("abc")
    public void show() {
        System.out.println("I am in Product method Show...");
    }
}

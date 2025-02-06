/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author developer
 */
public class Test15 {

}

public class Employee {

    String name; // Hidden from outside

    // Getter to allow controlled access
    public String getName() {
        return name;
    }

    // Setter to enforce constraints
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
}

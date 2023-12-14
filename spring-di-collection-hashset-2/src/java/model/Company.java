/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;

/**
 *
 * @author developer
 */
public class Company {
    private HashSet<String> nameSet;

    public HashSet<String> getNameSet() {
        return nameSet;
    }

    public void setNameSet(HashSet<String> nameSet) {
        this.nameSet = nameSet;
    }
    
    public void show() {
        for (String name: nameSet) {
            System.out.println("Name = " + name);
        }
    }

}

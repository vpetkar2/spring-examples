/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author developer
 */
public class EmployeeModel {

    private HashMap<Integer, String> nameMap;

    public HashMap<Integer, String> getNameMap() {
        return nameMap;
    }

    public void setNameMap(HashMap<Integer, String> nameMap) {
        this.nameMap = nameMap;
    }
    
    public void show() {
        System.out.println(nameMap.get(101));
        System.out.println(nameMap.get(103));
        System.out.println(nameMap.get(104));
    }
}

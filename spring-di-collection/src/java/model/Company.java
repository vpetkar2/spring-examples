/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author developer
 */
public class Company {
 
    private ArrayList<String> nameList;

    public ArrayList<String> getNameList() {
        return nameList;
    }

    public void setNameList(ArrayList<String> nameList) {
        this.nameList = nameList;
    }
    
    public void display() {
        for (String ele: nameList) {
            System.out.println("Element - " + ele);
        }
    }
}

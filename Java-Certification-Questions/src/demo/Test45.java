/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author developer
 */
public class Test45 {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try {
            while (true) {
                myList.add("My String");
            }
        } catch (RuntimeException re) {
            System.out.println("Caught a RuntimeException");
        } catch (Exception e) {
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}

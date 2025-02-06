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
public class Test161 {
    int count;
    public static void displayMsg() {
        System.out.println("Welcome Visit Count: " + count++); // line n1
    }
    public static void main(String[] args) {
        Test161.displayMsg();
        displayMsg(); // line n2
    }
}

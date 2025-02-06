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
public class Test206 {
    String greet = "Welcome!";  // Instance variable

    public Test206() {
        String greet = "Hello!";  // Local variable in constructor
    }

    public void setGreet() {
        String greet = "Good Day!";  // Local variable in method
    }

    public static void main(String[] args) {
        Test206 t = new Test206();
        String greet = "Good Luck!";  // Local variable in main method
        System.out.println(t.greet);  // Accessing the instance variable of App
    }
}

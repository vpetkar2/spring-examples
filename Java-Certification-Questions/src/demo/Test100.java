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
public class Test100 {

    int count; // Instance variable

    public static void displayMsg() {
        count++; // Line n1
        System.out.println("Welcome " + "Visit Count: " + count); // Line n2
    }

    public static void main(String[] args) {
        Test100.displayMsg(); // Line n3
        Test100.displayMsg(); // Line n4
    }
}

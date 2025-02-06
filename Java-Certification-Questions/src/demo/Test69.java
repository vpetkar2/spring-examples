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
public class Test69 {

    public static void main(String[] args) {
        // Line n1: declare and initialize variable x
        
        // Valid
        byte x = 1; // Option A
        // short x = 1; // Option B
        // Integer x = new Integer('1'); // Option F
        
        // Invalid
        // String x = "1"; // Option C (not valid for switch)
        // long x = 1; // Option D (not valid for switch)
        // double x = 1; // Option E (not valid for switch)
        

        // Switch statement
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}


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
public class Test28 {

    static int i; // Static variable
    int j;        // Instance variable

    public static void main(String[] args) {
        Test28 x1 = new Test28();
        Test28 x2 = new Test28();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(
                x1.i + " "
                + // Static variable
                x1.j + " "
                + // Instance variable
                x2.i + " "
                + // Static variable
                x2.j // Instance variable
        );
    }
}

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
public class Test68 {

    // Static variable to hold the area
    static double area;

    // Instance variables for base and height
    int b = 2, h = 3;

    public static void main(String[] args) {
        // Local variables for base, height, and multiplier
        double p, b, h;

        // Check if the static area variable is 0
        if (area == 0) {
            // Assign new values to local variables
            b = 3;
            h = 4;
            p = 0.5;

            // Calculate the area using the local variables
            area = p * b * h;
        }

        // Print the calculated area
        System.out.println("Area is " + area);
    }
}

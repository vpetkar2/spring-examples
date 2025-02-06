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
public class Test70 {

    public static void main(String[] args) {
        Boolean[] bool = new Boolean[2]; // Declare an array of Boolean objects with size 2

        // Initialize the elements of the Boolean array
        bool[0] = new Boolean(Boolean.parseBoolean("true")); // Assigns Boolean.TRUE to bool[0]
        bool[1] = new Boolean(null); // Assigns Boolean.FALSE to bool[1], as null is treated as false

        // Print the values of the Boolean array elements
        System.out.println(bool[0] + " " + bool[1]); // Output: true false
    }
}

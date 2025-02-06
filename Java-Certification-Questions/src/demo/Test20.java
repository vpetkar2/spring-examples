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
public class Test20 {

    public static void main(String[] args) {
        int x = 5;
        while (isAvailable(x)) {
            System.out.print(x); // Line 6

            // Correct way
            x--;
        }
    }

    public static boolean isAvailable(int x) {
        return x-- > 0 ? true : false; // Line 12
    }
}

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
public class Test192 {
    public static void main(String[] args) {
        int array1[] = new int[3] {1, 2, 3};// - Invalid
        int array2[] = new int[3]; array2[0] = 1; array2[1] = 2; array2[2] = 3; // - Valid
        int array3[3] = new int[] {1, 2, 3}; // - Invalid
        int array4[] = new int[3]; array = {1, 2, 3}; // - Invalid
        int array5[] = new int[] {1,2,3}; // - Valid
    }
}

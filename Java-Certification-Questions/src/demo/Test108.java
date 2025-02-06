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
public class Test108 {

    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;

        /* line n1 */
        do {
            idx++;
        } while (idx < size - 1);
        
        System.out.print("The Top element: " + stack[idx]);
    }

}

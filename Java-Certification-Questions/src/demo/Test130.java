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
public class Test130 {

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        int x = array.length;
        /* line n1 */

        // Correct
        while (x > 0) {
            x--;
            System.out.print(array[x]);
        }

//        do {
//            x--;
//            System.out.print(array[x]);
//        } while (x >= 0);

//        while (x >= 0) {
//            System.out.print(array[x]);
//            x--;
//        }

//        do {
//            System.out.print(array[x]);
//            --x;
//        } while (x >= 0);

          // Correct
//        while (x > 0) {
//            System.out.print(array[--x]);
//        }
    }
}

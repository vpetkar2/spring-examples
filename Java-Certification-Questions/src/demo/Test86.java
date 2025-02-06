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
public class Test86 {

    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};

        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

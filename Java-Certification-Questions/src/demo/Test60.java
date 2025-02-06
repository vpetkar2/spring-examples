/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Arrays;

/**
 *
 * @author developer
 */
public class Test60 {

    public static void main(String[] args) {
        int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4];  // intArr[2] = 75
        intArr[4] = 90;         // intArr[4] = 90
        System.out.println(Arrays.toString(intArr));
    }
}

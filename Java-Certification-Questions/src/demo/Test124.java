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
public class Test124 {

    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = (j += i) / 5;
        System.out.print(i + " : " + j + " : " + k);
    }
}

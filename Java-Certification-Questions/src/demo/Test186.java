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
public class Test186 {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;
        int r1 = a * b / c + 1;
        int r2 = a / b * c + 1;
        int r3 = a * (b / (c + 1));
        System.out.println(r1 + " : " + r2 + " : " + r3);
    }
}


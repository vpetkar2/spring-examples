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
public class Test23 {

    public static void main(String[] args) {
        int x = 100;
        int a = x++; // a = 100, x = 101
        int b = ++x; // b = 101, x = 102
        int c = x++; // c = 102, x = 103
        int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : x;
        System.out.println(d);
    }
}

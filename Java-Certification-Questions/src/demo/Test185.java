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
public class Test185 {

    public static void main(String[] args) {
        int x = 10;
        int y = ++x;
        int z = 0;
        if (y >= 10 | y <= ++x) {
            z = x;
        } else {
            z = x++;
        }
        System.out.println(z);
    }
}






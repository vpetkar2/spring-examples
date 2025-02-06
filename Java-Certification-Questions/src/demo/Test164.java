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
public class Test164 {

    int i;
    static int j;

    public static void main(String[] args) {
        Test164 x1 = new Test164();
        Test164 x2 = new Test164();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j);
    }
}

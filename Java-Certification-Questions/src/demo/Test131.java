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
public class Test131 {

    int a1;

    public static void doProduct(int a) {
        a = a * a;
    }

    public static void doString(String s) {
        s.concat(" " + s);
    }

    public static void main(String[] args) {
        Test131 item = new Test131();
        item.a1 = 11;
        String sb = "Hello";
        Integer i = 10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i + " " + sb + " " + item.a1);
    }
}

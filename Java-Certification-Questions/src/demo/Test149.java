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
public class Test149 {

    public static void main(String[] args) {
        int x = 1, y = 1;
        if (x++ < ++y) {
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.println("Log " + x + ":" + y);
    }
}

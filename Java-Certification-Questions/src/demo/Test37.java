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
public class Test37 {

    public static void main(String[] args) {
        Test37 ts = new Test37();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }

    public static boolean doStuff() {
        return !isAvailable;
    }

    static boolean isAvailable = false;
}

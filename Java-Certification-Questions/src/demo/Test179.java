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
public class Test179 {

    public static boolean doStuff() {
        return !isAvailable;
    }
    static boolean isAvailable = true;

    public static void main(String[] args) {
        Test179 ts = new Test179();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }
}





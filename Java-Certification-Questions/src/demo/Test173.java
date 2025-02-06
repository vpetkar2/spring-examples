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
public class Test173 {

    public static void main(String[] args) {
        int x = 6;
        while (isAvailable(x)) {
            System.out.print(--x);
        }
    }

    public static boolean isAvailable(int x) {
        return --x > 0 ? true : false;
    }
}

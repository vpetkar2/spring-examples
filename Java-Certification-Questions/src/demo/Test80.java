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
public class Test80 {

    public static void main(String[] args) {
        try {
            int num = 10;
            int div = 0;
            int ans = num / div; // Line n1
        } catch (ArithmeticException ae) {
            ans = 0;
            System.out.println("Answer = 0");
        } catch (Exception e) {
            System.out.println("Invalid calculation");
        }
         System.out.println("Answer = " + ans); // Line n2
    }
}

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
public class Test176 {

    public static void main(String[] args) {
        int ans;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException ae) {
            ans = 0; //line n1
        } catch (Exception e) {
            System.out.println("Invalid Calculation");
        }
        System.out.println("Answer = " + ans); //line n2
    }

}

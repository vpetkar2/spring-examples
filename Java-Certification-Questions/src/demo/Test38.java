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
public class Test38 {

    public static void main(String[] args) {
        double discount = 0;
        int qty = Integer.parseInt("85");
        // line n1

        // Correct Answer A
//        if (qty >= 90) {
//            discount = 0.5;
//        }
//        if (qty > 80 && qty < 90) {
//            discount = 0.2;
//        }

        // Correct Answer C
        discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;

        System.out.println("Discount = " + discount);
    }
}



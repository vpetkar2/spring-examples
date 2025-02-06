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

class Cart {
    Producta p;
    double totalAmount;
}

class Producta {
    String name;
    Double price;
}

public class Test214 {
    public static void main(String[] args) {
        Cart c = new Cart();
        System.out.println(c.p + ":" + c.totalAmount);
    }
}


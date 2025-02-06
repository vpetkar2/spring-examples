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
abstract class Toy {

    int price;

    // line n1
    public static void insertToy() {
        /* code goes here */
    }

    final Toy getToy() {
        return new Toy();
    }

    public void printToy();

    public int calculatePrice() {
        return price;
    }

    public abstract int computeDiscount();

}

public class Test128 {

}

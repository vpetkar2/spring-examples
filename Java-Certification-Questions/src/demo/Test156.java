/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.IOException;

/**
 *
 * @author developer
 */
class MyExceptiona extends RuntimeException {
}

public class Test156 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (MyExceptiona ne) {
            System.out.print("A");
        }
    }

    public static void method1() {
        try {
            throw 3 > 10 ? new MyExceptiona() : new IOException();
        } catch (IOException ie) {
            System.out.println("I");
        } catch (Exception re) {
            System.out.print("B");
        }
    }
}





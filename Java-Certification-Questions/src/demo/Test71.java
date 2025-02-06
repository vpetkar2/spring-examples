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
class MyException extends RuntimeException {}

public class Test71 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.print("A");
        }
    }

    public static void method1() {
        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        } catch (RuntimeException re) {
            System.out.print("B");
        }
    }
}

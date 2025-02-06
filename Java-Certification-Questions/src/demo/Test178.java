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
class MyStringg {

    String msg;

    MyStringg(String msg) {
        this.msg = msg;
    }
}

public class Test178 {

    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyStringg("Java SE 8").msg);
    }
}

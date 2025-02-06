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
public class Test54 {

    public static void main(String[] args) {
        // Create a StringBuilder object
        System.out.println("Hello " + new StringBuilder("Java SE 8"));

        // Create a MyString object
        System.out.println("Hello " + new MyString("Java SE 8"));
    }
}

class MyString {

    String msg;

    MyString(String msg) {
        this.msg = msg;
    }
}

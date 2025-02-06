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
public class Test208 {
    int foo;               // Instance variable
    static int bar;        // Static variable

    static void process() {
        foo += 10;          // Error: Cannot access non-static field 'foo' from a static method
        bar += 10;
    }

    public static void main(String[] args) {
        Test208 firstObj = new Test208();
        Test208.process();      // Static method call
        System.out.println(firstObj.bar); // prints bar

        Test208 secondObj = new Test208();
        Test208.process();      // Static method call
        System.out.println(secondObj.bar); // prints bar
    }
}

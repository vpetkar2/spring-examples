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

class A {
    public A() {
        System.out.print("A ");
    }
}

class B extends A { // line n1
    public B() {
        System.out.print("B ");
    }
}

class Test27 extends B { // line n2
    public Test27() {
        System.out.print("C ");
    }

    public static void main(String[] args) {
        Test27 c = new Test27();
    }
}


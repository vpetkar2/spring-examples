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
class Base {

    public void test() {
        System.out.println("Base ");
    }
}

class DerivedA extends Base {

    public void test() {
        System.out.println("DerivedA ");
    }
}

class Test44DerivedB extends DerivedA {

    public void test() {
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
        Base b1 = new Test44DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new Test44DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
    }
}

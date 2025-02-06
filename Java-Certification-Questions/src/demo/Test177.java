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
class Basee {
    public void test() {
        System.out.println("Base ");
    }
}

class DerivedAa extends Basee {
    public void test() {
        System.out.println("DerivedA ");
    }
}

class Test177 extends DerivedAa {
    public void test() {
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
        Basee b1 = new Test177();
        Basee b2 = new DerivedAa();
        Basee b3 = new Test177();
        Basee b4 = b3;
        b1 = (Basee) b2;
        b1.test();
        b3.test();
    }
}




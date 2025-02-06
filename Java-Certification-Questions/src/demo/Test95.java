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
class Aa {

    public void test() {
        System.out.println("A");
    }
}

class Bb extends Aa {

    public void test() {
        System.out.println("Bb");
    }
}

class C extends Aa {

    public void test() {
        System.out.println("C");
    }
}

public class Test95 {

    public static void main(String[] args) {
        Aa b1 = new Aa(); // Valid
        Aa b2 = new C(); // Valid
        
        b1 = (Aa) b2;
        Aa b3 = (Bb) b2;

        b1.test(); // Polymorphic call to Bb's test()
        b3.test(); // Polymorphic call to C's test()
    }
}




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
class C2 {

    public void displayC2() {
        System.out.print("C2");
    }
}

interface I {

    public void displayI();
}

class C1 extends C2 implements I {

    public void displayI() {
        System.out.print("C1");
    }
}

public class Test119 {

    public static void main(String[] args) {

// Code fragment:
        C2 obj1 = new C1();
        I obj2 = new C1();

        C2 s = obj2;  // This will cause a compilation error
        I t = obj1;   // This will cause a compilation issue (Too ambiguous).

    }
}


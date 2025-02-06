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
interface Ii {

    public void displayI();
}

abstract class C22 implements Ii {

    public void displayC2() {
        System.out.print("C2");
    }
}

class C11 extends C22 {

    public void displayI() {
        System.out.print("C1");
    }
}

public class Test162 {

    public static void main(String[] args) {
        C22 obj1 = new C11();
        Ii obj2 = new C11();
        C22 s = (C22) obj2;
        Ii t = obj1;

        t.displayI();
        s.displayC2();
    }
}

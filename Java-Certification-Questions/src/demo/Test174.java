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
class Aaaa {
    public void test() {
        System.out.println("A ");
    }
}

class Bbbb extends Aaaa {
    public void test() {
        System.out.println("B ");
    }
}

class Cccc extends Aaaa {
    public void test() {
        System.out.println("C ");
    }
}

public class Test174 {
    public static void main(String[] args) {
        Aaaa b1 = new Aaaa();
        Aaaa b2 = new Cccc();
        Aaaa b3 = (Bbbb) b2; //line n1
        b1 = (Aaaa) b2;
        b1.test();
        b3.test();
    }
}



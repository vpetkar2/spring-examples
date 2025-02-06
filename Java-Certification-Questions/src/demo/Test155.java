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
class Cc {

    public Cc() {
        System.out.print("C ");
    }
}

class Bbb extends Cc {

    public Bbb() {
        System.out.print("B ");
    }
}

class Aaa extends Bbb {

    public Aaa() {
        System.out.print("A ");
    }

    public static void main(String[] args) {
        Aaa a = new Aaa();
    }
}

public class Test155 {

}






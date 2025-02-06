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

class E1 extends Exception {}
class E2 extends RuntimeException {}

public class Test189 {
    public void m1() {
        System.out.println("m1.Accessed.");
        throw new E1();
    }

    public void m2() {
        System.out.println("m2.Accessed.");
        throw new E2();
    }

    public static void main(String[] args) {
        int level = 1;
        Test189 obj = new Test189();
        if (level <= 5 && level >= 3) {
            obj.m1();
        } else {
            obj.m2();
        }
    }
}





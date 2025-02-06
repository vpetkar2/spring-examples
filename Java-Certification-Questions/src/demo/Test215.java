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

class Bookk {
    int pages;
}

public class Test215 {
    int count;

    public void method(Bookk x, int k) {
        x.pages = 100;
        k = 200;
    }

    public static void main(String[] args) {
        Test215 obj = new Test215();
        Bookk objBookk = new Bookk();
        System.out.println(objBookk.pages + ":" + obj.count);
        obj.method(objBookk, obj.count);
        System.out.println(objBookk.pages + ":" + obj.count);
    }
}

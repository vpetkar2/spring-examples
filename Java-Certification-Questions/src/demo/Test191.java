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

class Alphaa {
    int ns;
    static int s;
    Alphaa (int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }
    void doPrint() {
        System.out.println("ns= " + ns + " s = " + s);
    }
}

public class Test191 {
    public static void main(String[] args) {
        Alphaa ref1 = new Alphaa(100);
        Alphaa ref2 = new Alphaa(50);
        Alphaa ref3 = new Alphaa(125);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}





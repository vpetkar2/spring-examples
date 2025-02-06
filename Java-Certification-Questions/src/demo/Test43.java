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
// Acc.java
package p1 ;

public class Acc {

    int p;
    private int q;
    protected int r;
    public int s;
}

// Test.java
package p2 ;
    

import p1.Acc ;

    public class Test extends Acc {

    public static void main(String[] args) {
        Acc obj = new Test();
    }
}

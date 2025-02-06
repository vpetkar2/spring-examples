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
public class Test13 {
    
}

class CD {
    int r;

    CD(int r) {
        this.r = r;
    }
}

class DVD extends CD {
    int c;

    DVD(int r, int c) {
        // line n1
//        super(r);
//        this.c = c;
    }
}

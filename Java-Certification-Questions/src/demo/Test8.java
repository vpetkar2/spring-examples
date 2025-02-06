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
class Caller {

    private void init() {
        System.out.println("Initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }

}

public class Test8 {
    public static void main(String[] args) {
        Caller c = new Caller();
        c.start(); // line n1
        c.init();  // line n2
    }
}

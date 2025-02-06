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
class Callera {
    private void init() {
        System.out.println("Initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }
}

public class Test79 {
    public static void main(String[] args) {
        Callera c = new Callera();
         c.start(); // Compilation error
         c.init(); // Compilation error
    }
}

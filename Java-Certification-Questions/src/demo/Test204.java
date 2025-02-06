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
class Vehiclee {
    Vehiclee() {
        System.out.println("Vehicle");
    }
}

class Bus extends Vehiclee {
    Bus() {
        System.out.println("Bus");
    }
}

public class Test204 {
    public static void main(String[] args) {
        Vehiclee v = new Bus();
    }
}

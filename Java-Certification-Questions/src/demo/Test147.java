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
class Vehicleb {

    int x;

    Vehicleb() {
        this(10);
    }

    Vehicleb(int x) {
        this.x = x;
    }
}

class Carb extends Vehicleb {

    int y;

    Carb() {
        super(10);
    }

    Carb(int y) {
        super(y);
        this.y = y;
    }

    public String toString() {
        return super.x + " : " + this.y;
    }
}

public class Test147 {

    public static void main(String[] args) {
        Vehicleb y = new Carb(20);
        System.out.println(y);
    }
}

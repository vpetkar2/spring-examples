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
public class Test53 {

    public static void main(String[] args) {

    }
}

class Vehiclea {

    int x;

    Vehiclea() {
        this(10); // Line n1
    }

    Vehiclea(int x) {
        this.x = x;
    }
}

class Cara extends Vehiclea {

    int y;

    Cara() {
        super(); // Calls Vehicle() constructor
        this(20); // Line n2
    }

    Cara(int y) {
        this.y = y;
    }
}

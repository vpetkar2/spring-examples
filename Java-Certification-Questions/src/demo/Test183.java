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
class Bird {

    public void fly() {
        System.out.print("Fly.");
    }
}

class Peacock extends Bird {

    public void dance() {
        System.out.print("Dance.");
    }
}

public class Test183 {

    public static void main(String[] args) {
        Bird b = new Peacock();
        Peacock p = (Peacock) b;

//        Bird b = new Bird();
//        Peacock p = (Peacock) b;

        p.fly();
        p.dance();
    }
}


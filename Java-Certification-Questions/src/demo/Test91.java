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
class Animal {

    String type = "Canine";
    int maxSpeed = 60;

    Animal() {
    }

    Animal(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}

class WildAnimal extends Animal {

    String bounds;

    WildAnimal(String bounds) {
        super(); // Line n1
        this.bounds = bounds;
    }

    WildAnimal(String type, int maxSpeed, String bounds) {
        super(type, maxSpeed); // Line n2
        this.bounds = bounds;
    }
}

public class Test91 {

    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
        System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);
    }
}

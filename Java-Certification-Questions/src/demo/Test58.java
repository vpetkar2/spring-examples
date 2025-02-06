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
public class Test58 {

    public static void main(String[] args) {
        Planeta[] planets = {
            new Planeta("Mercury", 0),
            new Planeta("Venus", 0),
            new Planeta("Earth", 1),
            new Planeta("Mars", 2)
        };

        // Printing the Planeta array
        System.out.println(planets); // Reference to the array object

        // Accessing the third planet's name and its number of moons
        System.out.println(planets[2].name);  // Output: Earth
        System.out.println(planets[2].moons); // Output: 1
    }
}

class Planeta {

    public String name;
    public int moons;

    public Planeta(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }
}

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
class Studenta {

    String name;

    public Studenta(String name) {
        this.name = name;
    }
}

public class Test134 {

    public static void main(String[] args) {
        Studenta[] students = new Studenta[3];
        students[1] = new Studenta("Richard");
        students[2] = new Studenta("Donald");
        for (Studenta s : students) {
            System.out.println(" " + s.name);
        }
    }
}




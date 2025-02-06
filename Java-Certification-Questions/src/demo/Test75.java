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

public class Test75 {
    int id;
    String name;

    public Test75(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Test75 p1 = new Test75(101, "Pen");
        Test75 p2 = new Test75(101, "Pen");
        Test75 p3 = p1;

        boolean ans1 = p1 == p2;
        boolean ans2 = p1.name.equals(p2.name);

        System.out.println(ans1 + ":" + ans2);
    }
}



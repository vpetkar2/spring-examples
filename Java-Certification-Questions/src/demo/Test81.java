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
public class Test81 {

    int x;
    int y;

    public void doStuff(int x, int y) {
        x = x;
        y = this.y;
    }

    public void display() {
        System.out.print(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        Test81 m1 = new Test81();
        m1.x = 100;
        m1.y = 200;
        Test81 m2 = new Test81();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();
    }
}

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
public class Test129 {

    int x, y;

    public Test129(int x, int y) {
        initialize(x, y);
    }

    public void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        Test129 obj = new Test129(x, y);
        System.out.println(x + " " + y);
    }
}


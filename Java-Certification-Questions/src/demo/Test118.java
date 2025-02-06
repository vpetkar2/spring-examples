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
public class Test118 {

    public static int stVar = 100;
    public int var = 200;

    public String toString() {
        return stVar + ":" + var;
    }

    public static void main(String[] args) {
        Test118 t1 = new Test118();
        t1.var = 300;
        System.out.println(t1);

        Test118 t2 = new Test118();
        t2.stVar = 300;
        System.out.println(t2);
    }
}

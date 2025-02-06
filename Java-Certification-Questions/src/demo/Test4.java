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
public class Test4 {

    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2; // line n1
        String s4 = (String) (s3 * s2); // line n2
        System.out.println("Sum is " + s4);
    }
}

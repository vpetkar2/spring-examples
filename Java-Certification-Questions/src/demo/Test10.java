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
public class Test10 {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        if (sb.toString().equals(s.toString())) {
            System.out.println("Match 1");
        } else if (sb.equals(s)) {
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }
    }
    
}

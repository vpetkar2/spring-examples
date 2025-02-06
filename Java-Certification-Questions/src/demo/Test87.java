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
public class Test87 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");

        // Option C: Emptying the contents
        sb.delete(0, sb.length());

        System.out.println("StringBuilder after clearing: [" + sb + "]");
    }
}



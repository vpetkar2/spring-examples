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
public class Test36 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        // insert code here
        // Correct Way
        String str2 = str1;
        System.out.print(str1 == str2);
    }
}
    
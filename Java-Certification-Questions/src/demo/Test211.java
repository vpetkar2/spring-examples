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
public class Test211 {

    public static void main(String[] args) {
        String str = "Sweet Sweat";
        String str2 = str.trim().charAt(6) + "" + str.indexOf("Sw", 1);
        System.out.println(str2);
    }
}

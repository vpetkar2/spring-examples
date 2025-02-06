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
public class Test83 {

    public static void main(String[] args) {
        int aVar = 9;
        if (aVar++ < 10) {
            System.out.println(aVar + " Hello Universe!");
        } else {
            System.out.println(aVar + " Hello World!");
        }
    }
}

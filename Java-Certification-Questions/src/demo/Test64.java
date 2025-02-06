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
public class Test64 {

    public static void main(String[] args) {
        int var1 = 200;
        System.out.print(doCalc(var1)); // Returns 400
        System.out.print(" " + var1);  // Prints original var1 = 200
    }

    static int doCalc(int var1) {
        var1 = var1 * 2;
        return var1;
    }
}

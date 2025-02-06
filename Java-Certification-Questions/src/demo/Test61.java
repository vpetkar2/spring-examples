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
public class Test61 {
    public static void main(String[] args) {
        int[] intArr = {8, 16, 32, 64, 128};
        
//        Option B
        for (int i : intArr) { System.out.print(i + " "); }
        
//        Option E
        for (int i = 0; i < intArr.length; i++) { System.out.print(intArr[i] + " "); }
    }
   
}

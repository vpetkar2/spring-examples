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
public class Test82 {// Vowel Class

    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Test82 obj1 = new Test82();
        Test82 obj2 = obj1;
        obj1.var = 'o';
        obj2.var = 'i';

        System.out.println(var1 + ", " + var2);
        System.out.print(obj1.var + ", " + obj2.var);
    }
}

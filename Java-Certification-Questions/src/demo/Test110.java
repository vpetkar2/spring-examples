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
public class Test110 {

    public static void main(String[] args) {
        String str1 = "Java";
        String[] str2 = {"J", "a", "v", "a"};
        String str3 = "";

        for (String str : str2) {
            str3 = str3 + str;
        }

        boolean b1 = (str1.equals(str3));
        boolean b2 = (str1 == str3);

        System.out.print(b1 + ", " + b2);
    }
}

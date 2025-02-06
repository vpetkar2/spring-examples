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
public class Test88 {

    public static void main(String[] args) {
        String stuff = "TV";
        String res = stuff.equals("TV") ? "Walter"
                : stuff.equals("Movie") ? "White" : "No Result";

        System.out.println(res);
    }
}

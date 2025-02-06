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
public class Test154 {

    public static void main(String[] args) {
        String[] strs = {"A", "B"};
        int idx = 0;
        for (String s : strs) {
            strs[idx].concat(" element " + idx);
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}

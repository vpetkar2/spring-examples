/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author developer
 */
public class Test153 {

    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf(s -> {
            System.out.print(s);
            return s.length() <= 2;
        })) {
            System.out.println(" removed");
        }
        System.out.println((arrList));
    }
}


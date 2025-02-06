/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author developer
 */
public class Test203 {

    public static void main(String[] args) {
        List<String> lst = Arrays.asList("EN", "FR", "CH", "JP");
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {
            String e = itr.next();
            if (e == "CH") {
                break;
            }
            System.out.print(e + " ");
        }
    }
}

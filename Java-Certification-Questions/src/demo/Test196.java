/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author developer
 */
public class Test196 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0, "Java");
        arrayList.forEach(a -> a.concat("Forum"));
        arrayList.replaceAll(s -> s.concat("Group"));
        System.out.println(arrayList);
    }
}


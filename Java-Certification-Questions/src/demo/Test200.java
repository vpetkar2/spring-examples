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
class Productt {

    int id;
    String name;

    Productt(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Test200 {

    public static void main(String[] args) {
        List<Productt> lst = new ArrayList<>();
        lst.add(new Productt(10, "IceCream"));
        lst.add(new Productt(11, "Chocolate"));
        Productt p1 = new Productt(10, "IceCream");
        System.out.println(lst.indexOf(p1));
    }
}






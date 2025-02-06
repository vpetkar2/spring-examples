/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.List;

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }
}

public class Test89 {
    public static void main(String[] args) {
        List ps = new ArrayList<>();
        Patient p2 = new Patient("Mike");
        ps.add(p2);

        int f = ps.indexOf(p2); // Line 14

        if (f >= 0) {
            System.out.print("Mike Found");
        }
    }
}




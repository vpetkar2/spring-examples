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
public class Test25 {

    String name;
    boolean contract;
    double salary;

    Test25() {
        // line n1

//        Incorrect
//        name = "Joe";
//        contract = TRUE; // TRUE is not correct
//        salary = 100.0f;

//        Correct Way 1
//        this.name = new String("Joe");
//        this.contract = new Boolean(true);
//        this.salary = new Double(100);
    }

    public String toString() {
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Test25 e = new Test25();
        // line n2

//      Correct Way 2        
        e.name = "Joe";
        e.contract = true;
        e.salary = 100;
        System.out.print(e);
    }
}

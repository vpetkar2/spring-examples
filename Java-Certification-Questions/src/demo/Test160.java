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
class Employeee {

    public int salary;
}

class Managerr extends Employeee {

    public int budget;
}

class Directorr extends Managerr {

    public int stockOptions;
}

public class Test160 {

    public static void main(String[] args) {
        Employeee employee = new Employeee();
        Employeee manager = new Managerr();
        Employeee director = new Directorr();
        // line n1
    }
}

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
class Employeea {
    public int salary;
}

class Manager extends Employeea {
    public int budget;
}

class Director extends Manager {
    public int stockOptions;
}

public class Test76 {
    public static void main(String[] args) {
        Employeea employee = new Employeea();
        Manager manager = new Manager();
        Director director = new Director();

        // Uncommenting these lines will give a compilation error:
         employee.budget = 200_000; // Compilation error
         manager.stockOption = 500; // Compilation error

        director.salary = 80_000; // Valid
        manager.budget = 1_000_000; // Valid
        director.stockOptions = 1_000; // Valid
    }
}

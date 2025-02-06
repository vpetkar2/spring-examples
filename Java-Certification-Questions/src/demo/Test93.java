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
class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = 2000; // Missing default value setter
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(name + " : " + age + " : " + salary);
    }
}

public class Test93 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Jack", 50);
        Employee e3 = new Employee("Chloe", 40, 5000);

        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author developer
 */
public class Employee {
    private String name;
    private int age;
    private Salary salary;

    public Employee(String name, int age, Salary salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Salary getSalary() {
        return salary;
    }
    
    public void show() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Basic Salary = " + salary.getBasic());
        System.out.println("Hra Salary = " + salary.getHra());
        System.out.println("Da Salary = " + salary.getDa());
        System.out.println("Gross Salary = " + salary.getGross());
    }
}

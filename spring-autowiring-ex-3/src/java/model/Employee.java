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
    
    public Employee(Salary salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Salary getSalary() {
        return salary;
    }

    public void show() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Basic = " + salary.getBasic());
        System.out.println("HRA = " + salary.getHra());
        System.out.println("DA = " + salary.getDa());
        System.out.println("Gross = " + salary.getGross());
    }
}

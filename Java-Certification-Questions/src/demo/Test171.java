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
class Employeeee {
    private String name;
    private int age;
    private int salary;

    public Employeeee(String name, int age) {
        setName(name);
        setAge(age);
        setSalary(2000);
    }

    public Employeeee(String name, int age, int salary) {
        this(name, age);
        setSalary(salary);
    }

    //getter and setter methods for attributes go here

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    

    public void printDetails() {
        System.out.println(name + " : " + age + " : " + salary);
    }
}

class Test171 {
    public static void main(String[] args) {
        Employeeee e1 = new Employeeee();
        Employeeee e2 = new Employeeee("Jack", 50);
        Employeeee e3 = new Employeeee("Chloe", 40, 5000);

        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}

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
public class Test101 {

    String name;
    int age = 25;

    Test101(String name) { // Line n1
        setName(name);
    }

    public Test101(String name, int age) {
        Test101(name);     // Line n2
        setAge(age);
    }

    // setter and getter methods go here
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

    
    public String show() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        Test101 p1 = new Test101("Jesse");
        Test101 p2 = new Test101("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}

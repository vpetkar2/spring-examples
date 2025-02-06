/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author developer
 */
public class Test47 {
    
    public static void checkAge(List<Person> list, Predicate<Person> predicate) {
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Hank", 45),
                new Person("Charlie", 40),
                new Person("Smith", 38)
        );
        // line n1
        checkAge(list, p -> p.getAge() > 40);
    }
}

class Person {
    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


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
class Student {
    String name;
    int age;
}

public class Test121 {
    public static void main(String[] args) {
        Student s1 = new Student(); // Line 6
        Student s2 = new Student(); // Line 7
        Student s3 = new Student(); // Line 8
        s1 = s3; // Line 9
        s3 = s2; // Line 10
        s2 = null; // Line 11
    }
}

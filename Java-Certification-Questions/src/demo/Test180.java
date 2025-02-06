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
class Studentt {
    String name;
    int age;
}

public class Test180 {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        Studentt s2 = new Studentt();
        Studentt s3 = new Studentt();
        s1 = s3;
        s3 = s2;
        s1 = s2;
    }
}

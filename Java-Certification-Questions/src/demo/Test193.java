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
class C111 {
}

class C222 extends C111 {
}

class C333 extends C222 {
}

public class Test193 {

    public static void main(String[] args) {
        C111 obj1 = (C111) new C222();
        C222 obj2 = (C222) new C333();
        C222 obj3 = (C222) new C111();
        C333 obj4 = (C333) obj2;
    }
}


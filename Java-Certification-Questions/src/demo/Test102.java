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
public class Test102 {

    static int count = 0; // static variable
    int i = 0;           // instance variable

    public void changeCount() {
        while (i < 5) {
            i++;         // increment instance variable i
            count++;     // increment static variable count
        }
    }

    public static void main(String[] args) {
        Test102 check1 = new Test102();
        Test102 check2 = new Test102();
        check1.changeCount();
        check2.changeCount();
        System.out.print(check1.count + " : " + check2.count);
    }
}

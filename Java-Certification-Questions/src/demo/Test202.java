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
class S1 {
    protected void display(int x) {
        System.out.print("Parent " + x);
    }
}

class S2 extends S1 {
    public void display(int x, int y) {
        this.display(x);  // Calls S2's display(int)
        display(y);        // Calls S2's display(int), but here it's not using "super"
        super.display(y);  // Calls S1's display(int)
    }

    public void display(int x) {
        System.out.println("Child " + x);  // Prints "Child " followed by x
    }
}

public class Test202 {
    public static void main(String[] args) {
        S2 obj = new S2();
        obj.display(10, 100);
    }
}

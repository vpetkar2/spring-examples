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
public class Test65 {

    int num;

    // Static method to modify the value of num in the passed object
    public static void graceMarks(Test65 obj) {
        obj.num += 10; // Increment num by 10
    }

    public static void main(String[] args) {
        // Create the first Test65 object
        Test65 obj1 = new Test65();
        // Assign obj1 to obj2 (both reference the same object)
        Test65 obj2 = obj1;
        // Set obj3 to null (no object is created for obj3)
        Test65 obj3 = null;

        // Assign a value to num using obj2
        obj2.num = 60;

        // Call the static method graceMarks and pass obj2
        graceMarks(obj2);

        // Output the value of num (should be incremented by 10)
        System.out.println("obj1.num = " + obj1.num); // Output: obj1.num = 70
    }
}


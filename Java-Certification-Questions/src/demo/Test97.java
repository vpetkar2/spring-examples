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
public class Test97 {

    public static void main(String[] args) {
        int numbers[] = {12, 13, 42, 32, 15, 156, 23, 51, 12};
        int max = findMax(numbers);
        System.out.println("Max Value: " + max);
    }

    static int findMax(int[] numbers) { // Correct method signature
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

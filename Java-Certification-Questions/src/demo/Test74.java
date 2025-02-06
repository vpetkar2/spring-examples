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
public class Test74 {

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3};
        int nums2[] = {1, 2, 3, 4, 5};
        nums2 = nums1;
        for (int x : nums2) {
            System.out.print(x + ":");
        }
    }
}

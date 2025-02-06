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
public class Test190 {

    public static void main(String[] args) {
        char colorCode = 'y';
        switch (colorCode) {
            case 'r':
                int color = 100;
                break;
            case 'b':
                color = 10;
                break;
            case 'y':
                color = 1;
                break;
        }
        System.out.println(color);
    }
}


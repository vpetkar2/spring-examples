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
class Shirt {

    public static String getColor() {
        return "Green";
    }
}

public class Test120 {  // Jeans class

    public void matchShirt() {
        // Line n2
        String color = Shirt.getColor();
        if (color.equals("Green")) {
            System.out.print("Fit");
        }
    }

    public static void main(String[] args) {
        Test120 trouser = new Test120();
        trouser.matchShirt();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

class Product {
    double price;
}

public class Test1 {
    public void updatePrice(Product product, double price) {
        price = price * 2;
        product.price = product.price + price;
    }

    public static void main(String[] args) {
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        Test1 t = new Test1();
        t.updatePrice(prt, newPrice);
        System.out.println(prt.price + " : " + newPrice);
    }
}


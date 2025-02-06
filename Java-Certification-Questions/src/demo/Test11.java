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
public class Test11 {
    public static void main(String[] args) {
        Book book1 = new EBook();
        book1.readBook();
    }
}

interface Readable {
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable { // line n1
    public void readBook() { }            // line n2
}

class EBook extends Book {                // line n3
    public void readBook() { }            
    // line n4
//    public void setBookMark() {}
}

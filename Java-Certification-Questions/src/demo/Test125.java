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
public class Test125 {
    
}

interface Downloadable {
    public void download();
}

interface Readablea extends Downloadable { // line n1
    public void readBook();
}

abstract class Booka implements Readablea { // line n2
    public void readBook() {
        System.out.println("Read Book");
    }
}

class EBooka extends Booka { // line n3
    public void readBook() {
        System.out.println("Read E-Book");
    }
}

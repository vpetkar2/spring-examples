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
public class Test6 {
    
}

abstract class Planet {
    protected void revolve() { } // line n1
    abstract void rotate();      // line n2
}

class Earth extends Planet {
    void revolve() { }           // line n3
    protected void rotate() { }  // line n4
}


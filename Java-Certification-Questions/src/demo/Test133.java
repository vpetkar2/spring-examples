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

abstract class A3 {
    private static int i;
    public void doStuff(){}
    public A3(){}
}

final class A1 {
    public A1(){}
}

private class A2 {
    private static int i;
    private A2(){}
}

class A4 {
    protected static final int i = 10;
    private A4() {}
}

final abstract class A5 {
    protected static int i;
    void doStuff(){}
    abstract void doIt();
}

public class Test133 {
    
}

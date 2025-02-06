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

abstract class Robot implements Speakable {
    public void process() {}
}

class Humanoid extends Robot {
    public void speak(String s) { System.out.println(s); }
    public void process() { System.out.println("Helping... "); }
}

interface Speakable {
    public void speak(String s);
}

public class Test222 {
    public static void main(String[] args) {
        Robot r = new Humanoid();
        r.process();
        r.speak("Done");
    }
}


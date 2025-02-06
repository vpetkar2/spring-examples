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

class LogFileException extends Exception {}
class AccessViolationException extends RuntimeException {}

public class Test187 {
    public static void main(String[] args) throws LogFileException {
        Test187 obj = new Test187();
        try {
            obj.open();
            obj.process();
        } catch (Exception e) {
            System.out.println("Completed.");
        }
    }

    public void process() throws LogFileException {
        throw new LogFileException();
    }

    public void open() {
        System.out.println("Opened.");
        throw new AccessViolationException();
    }
}





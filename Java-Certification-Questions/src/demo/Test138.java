/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.IOException;

/**
 *
 * @author developer
 */
class X {

    public void printFileContent() throws IOException {
        /* code goes here */
        throw new IOException();
    }
}

public class Test138 {

    public static void main(String[] args) {
        X xobj = new X();
        
//        xobj.printFileContent();
        
        try {
            xobj.printFileContent();
        } catch(Exception e) {
            
        } catch(IOException e) {
            
        }
        
    }
}


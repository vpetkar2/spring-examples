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
public class Test56 {

//    Not Valid
    public static void main(int[] args) {
        System.out.println("int main " + args[0]);
    }

//    Not Valid
    public static void main(Object[] args) {
        System.out.println("int main " + args[0]);
    }

    public static void main(String[] args) {
        System.out.println("int main " + args[0]);
    }
    
//    The provided signature has int[] args, which is invalid as the JVM cannot recognize this as a valid entry point.
}


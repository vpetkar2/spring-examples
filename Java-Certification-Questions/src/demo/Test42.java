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
public class Test42 {

    public static String maskCC(String creditCard) {
        String x = "XXXX-XXXX-XXXX-";
        // line n1
        
//        StringBuilder sb = new StringBuilder(creditCard); 
//        sb.substring(15, 19); 
//        return x + sb;
  
//      Correct
//        return x + creditCard.substring(15, 19);

//      Correct
//          StringBuilder sb = new StringBuilder(x); 
//          sb.append(creditCard, 15, 19); 
//          return sb.toString();

//            StringBuilder sb = new StringBuilder(creditCard); 
//            StringBuilder g = sb.insert(0, x); 
//            return g.toString();
    }

    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));
    }
}

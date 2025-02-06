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
public class Test19 {

    void readCard(int cardNo) throws Exception {
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException { // line n1
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        Test19 ex = new Test19();
        int cardNo = 12344;
        ex.readCard(cardNo); // line n2

//        // Correct Way
//        try {
//            ex.readCard(cardNo); // line n2
//        } catch(Exception e) {
//            
//        }
        
        ex.checkCard(cardNo); // line n3
    }
}

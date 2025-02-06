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

public class Customer {
    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kWh) {
        acct.addKWh(kWh);
    }
}

public class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    // line n1
}

public class Test9 {
    
}

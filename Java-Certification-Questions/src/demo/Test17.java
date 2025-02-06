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
public class Test17 {

    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int) (Math.random() * 1000));

// Correct Options

//          acct.amount = 0;

//          acct.setAmount(0);

//          acct.changeAmount(-acct.getAmount());


        System.out.println(acct.getAmount());
    }

}

class CheckingAccount {

    public int amount;

    public CheckingAccount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void changeAmount(int x) {
        amount += x;
    }
}

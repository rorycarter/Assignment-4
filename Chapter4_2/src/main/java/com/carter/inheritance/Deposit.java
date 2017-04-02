package com.carter.inheritance;

/**
 * Created by Rory on 2017-03-29.
 */
public class Deposit implements TransInter {

    private Account acc;
    public Deposit(int accNum, double balance) {
        acc = new Account(accNum, balance);
    }


    public double execute(double amount){
        return acc.getAccountBalance()+amount;
    }
}

package com.carter.inheritance;

/**
 * Created by Rory on 2017-03-29.
 */
public class Withdraw implements TransInter {
    private  Account account;
    public Withdraw(int accNum, double balance) {

        account = new Account(accNum, balance);
    }


    public double execute(double amount){
        return account.getAccountBalance()-amount;
    }

}

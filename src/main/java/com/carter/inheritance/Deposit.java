package com.carter.inheritance;

/**
 * Created by Rory on 2017-03-29.
 */
public class Deposit extends Account implements TransInter {

    public Deposit(int accNum, double balance)
    {
        super(accNum, balance);
    }


    public double execute(double amount)
    {
        return getAccountBalance()+amount;
    }
}

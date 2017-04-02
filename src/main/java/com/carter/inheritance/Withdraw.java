package com.carter.inheritance;

/**
 * Created by Rory on 2017-03-29.
 */
public class Withdraw extends Account implements TransInter
{
    public Withdraw(int accNum, double balance)
    {
        super(accNum, balance);
    }


    public double execute(double amount)
    {
        return getAccountBalance()-amount;
    }



}

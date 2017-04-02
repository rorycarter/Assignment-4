package com.carter.inheritance;

/**
 * Created by Rory on 2017-03-29.
 */
public class Account {

        private int accNumber;

        private double accountBalance;

        public Account()
        {

        }

        public Account(int num, double bal)
        {

            accNumber=num;
            accountBalance=bal;

        }

        public void setAccNumber(int num) {
            accNumber = num;


        }

        public void setAccountBalance(double bal)
        {

            accountBalance=bal;
        }

        public int getAccNumber() {

            return accNumber;
        }

        public double getAccountBalance()
        {
            return accountBalance;

        }

        public String toString()
        {
            return String.format("Acc Number: "+accNumber);

        }
        public double withdraw(double amt)
        {
            accountBalance=accountBalance-amt;

            return accountBalance;



        }

        public double deposit(double amt)
        {
            accountBalance=accountBalance+amt;
            return accountBalance;
        }



    }






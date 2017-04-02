package com.carter.plkViolation;

/**
 * Created by Rory on 2017-04-02.
 */
public class AllCalculations {

    private static int addition(int a, int b)
    {
        return a+b;
    }
    private static int subtraction(int a, int b)
    {
        return a-b;
    }

    public static void main (String []args)
    {
        System.out.println(addition(19,19));
        System.out.println(subtraction(10,10));
    }
}

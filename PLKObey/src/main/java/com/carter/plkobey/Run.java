package com.carter.plkobey;

/**
 * Created by Rory on 2017-03-31.
 */
public class Run {
    public static void main (String []args)
    {
        Add add = new Add(10, 10);
        System.out.println(add.calc());

        Subtract sub = new Subtract(6, 2);
        System.out.println(sub.calc());

    }
}

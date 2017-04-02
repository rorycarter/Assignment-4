package com.carter.plkobey;

/**
 * Created by Rory on 2017-03-31.
 */
public class Subtract extends Calculate {
    private int num1;
    private int num2;

    public Subtract(int a, int b)
    {

        if (a > 0)
        {
            num1 = a;
            num2 = b;
        }

        else
            System.out.println("Wrong..Number 1 cannot be less than or equal to 0.");

    }


    public int calc()
    {
        return num1-num2;
    }
}

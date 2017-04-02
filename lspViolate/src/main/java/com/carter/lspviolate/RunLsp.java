package com.carter.lspviolate;

/**
 * Created by Rory on 2017-03-30.
 */
public class RunLsp {
    private static Rectangle getNewRectangle()
    {
        return new Square();
    }

    public static void main(String[] args) {
        Rectangle r = RunLsp.getNewRectangle();
        r.setHeight(5);
        r.setWidth(10);
        System.out.println(r.getArea());
    }


}

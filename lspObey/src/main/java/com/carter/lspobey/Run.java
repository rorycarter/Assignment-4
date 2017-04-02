package com.carter.lspobey;

/**
 * Created by Rory on 2017-03-30.
 */
public class Run {
    private static Rectangle getNewRectangle()
    {
        return new Rectangle();
    }

    public static void main(String[] args) {

        Rectangle r = Run.getNewRectangle();
        r.setHeight(5);
        r.setWidth(10);
        System.out.println(r.getArea());
    }

}

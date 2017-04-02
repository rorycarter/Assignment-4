package com.carter.ocpviolate;

/**
 * Created by Rory on 2017-03-30.
 */
public class CalculateArea {
    public double area(String add){
        double area = 0;
        if(add.equalsIgnoreCase("rectangle"))
        {
            Rectangle r = new Rectangle(100,100);
            area = r.getHeight() * r.getWidth();
        }
        else
        {
            Circle c = new Circle(10);
            area = c.getRadius() * c.getRadius() * Math.PI;
        }

        return area;
    }

}

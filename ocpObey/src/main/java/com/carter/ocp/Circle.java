package com.carter.ocp;

/**
 * Created by Rory on 2017-03-30.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double rad) {
        this.radius = rad;
    }

    public Circle() {
    }

    public double getRadius()
    {
        return radius;
    }
    @Override
    public double calcArea()
    {
        return radius * radius * Math.PI;
    }
}

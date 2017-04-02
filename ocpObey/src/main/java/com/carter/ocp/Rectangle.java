package com.carter.ocp;

/**
 * Created by Rory on 2017-03-30.
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(){}
    public Rectangle(double width, double height)
    {
        this.width =width;
        this.height=height;
    }

    public double getWidth(){return width;}

    public double getHeight(){
        return height;
    }

    @Override
    public double calcArea()
    {
        return width*height;
    }
}

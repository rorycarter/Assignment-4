package com.carter.lspobey;

/**
 * Created by Rory on 2017-03-30.
 */
public class Rectangle {
    private int width;
    private int height;

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getArea()
    {
        return width * height;
    }


}

package com.carter.lspobey;

/**
 * Created by Rory on 2017-03-30.
 */
public class Square extends Rectangle {

    private int width;
    private int height;

    public void setWidth(int width)
    {
        this.width = width;
        this.height = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
        this.width = height;
    }


}

package com.carter.lspobey;

import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by Rory on 2017-03-30.
 */
public class RectangleTest {
    Square sqr;
    Rectangle rect;
    @Before
    public void setUp() throws Exception {
        sqr = new Square();
        rect = new Rectangle();

    }

    @org.junit.Test
    public void setWidth() throws Exception {

        sqr.setWidth(25);
        Assert.assertEquals(25,25);
        rect.setWidth(27);
        Assert.assertEquals(27,27);

    }

    @org.junit.Test
    public void setHeight() throws Exception {
    sqr.setHeight(30);
    Assert.assertEquals(30,30);
    rect.setHeight(90);
    Assert.assertEquals(90,90);
    }


    @org.junit.Test
    public void getWidth() throws Exception {

        rect.setWidth(25);
        Assert.assertEquals(25,rect.getWidth());

    }

    @org.junit.Test
    public void getHeight() throws Exception {
        rect.setHeight(90);
        Assert.assertEquals(90,rect.getHeight());
    }

    @org.junit.Test
    public void getArea() throws Exception {


        rect.setWidth(5);
        rect.setHeight(10);
        Assert.assertEquals(50,rect.getArea());

    }

}
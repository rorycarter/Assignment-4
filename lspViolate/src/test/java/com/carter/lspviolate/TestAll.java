package com.carter.lspviolate;

import org.junit.Before;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-03-30.
 */
public class TestAll {
    Rectangle r;
    Square s;

    @Before
    public void setUp() throws Exception {
        s = new Square();
        r = new Rectangle();
    }

    @Test
    public void setWidth() throws Exception {
        r.setWidth(27);
        Assert.assertEquals(27,27);
        s.setWidth(25);
        Assert.assertEquals(25,25);


    }

    @Test
    public void setHeight() throws Exception {
        r.setHeight(90);
        Assert.assertEquals(90,90);
        s.setHeight(25);
        Assert.assertEquals(25,25);


    }


    @Test
    public void getWidth() throws Exception {
        r.setWidth(25);
        Assert.assertEquals(25,r.getWidth());
    }

    @Test
    public void getHeight() throws Exception {
        r.setHeight(90);
        Assert.assertEquals(90, r.getHeight());

    }

    @Test
    public void getArea() throws Exception {
        r.setWidth(12);
        r.setHeight(12);
        Assert.assertEquals(144,r.getArea());
    }

}
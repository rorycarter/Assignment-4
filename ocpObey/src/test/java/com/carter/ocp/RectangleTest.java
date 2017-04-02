package com.carter.ocp;

import org.junit.Before;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-03-30.
 */
public class RectangleTest {
    Rectangle r;
    @Before
    public void setUp() throws Exception {

        r = new Rectangle(100,100);

    }

    @Test
    public void calcArea() throws Exception {
        Assert.assertEquals(10000.00, r.calcArea(), 00);

    }

}
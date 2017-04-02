package com.carter.ocp;

import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-03-30.
 */
public class CircleTest {
    Circle c;
    @Before
    public void setUp() throws Exception {

        c = new Circle(25);

    }



    @Test
    public void calcArea() throws Exception {




        Assert.assertEquals(c.calcArea(), 1963.4954084936207, 00);
    }

}
package com.carter.ocpviolate;

import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by Rory on 2017-03-30.
 */
public class CalculateAreaTest {
    Rectangle r;
    Circle c;
    CalculateArea ca;
    @Before
    public void setUp() throws Exception {
        ca = new CalculateArea();

    }

    @Test
    public void area() throws Exception {
        Assert.assertEquals(ca.area("rectangle"), 10000, 00);
    }



}
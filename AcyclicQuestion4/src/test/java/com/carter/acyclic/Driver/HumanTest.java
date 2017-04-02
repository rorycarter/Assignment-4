package com.carter.acyclic.Driver;

import com.carter.acyclic.Drive.DriverInterface;
import com.carter.acyclic.Driver.Human;
import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by Rory on 2017-04-02.
 */
public class HumanTest {
    private DriverInterface a;
    @org.junit.Before
    public void setUp() throws Exception {

        a = new Human();
    }

    @org.junit.Test
    public void getCar() throws Exception {
        Assert.assertEquals("Volkswagen", a.getCar("Volkswagen"));
    }

    @org.junit.Test
    public void driving() throws Exception {

        Assert.assertTrue("vehicle isn't moving", a.driving("yes"));


    }

}
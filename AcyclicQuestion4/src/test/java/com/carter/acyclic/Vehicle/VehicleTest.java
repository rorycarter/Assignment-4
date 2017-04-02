package com.carter.acyclic.Vehicle;

import org.junit.*;

import static org.junit.Assert.*;
import com.carter.acyclic.Drive.DriverInterface;
import com.carter.acyclic.Vehicle.Vehicle;
/**
 * Created by Rory on 2017-04-02.
 */
public class VehicleTest {
    private DriverInterface b;

    @Before
    public void setUp() throws Exception {
        b = new Vehicle();
    }

    @Test
    public void testDriveCar() throws Exception {
        Assert.assertEquals("Vehicle is driving at 120km/h", b.driveCar(b, "yes"));

    }
}
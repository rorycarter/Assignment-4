package com.carter.dipViolate;

import static org.junit.Assert.*;
import org.junit.Assert;
/**
 * Created by Rory on 2017-03-30.
 */
public class TestAll {
    private Manager manager;
    private SuperWorker superWorker;
    private Worker worker;


    @org.junit.Before
    public void setUp() throws Exception
    {
        manager = new Manager();
        superWorker = new SuperWorker();
        worker = new Worker();


    }

    @org.junit.Test
    public void setWorker() throws Exception
    {
        manager.setWorker(worker);
        Assert.assertEquals(worker,worker);
    }

}
package com.carter.ispViolate;

import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by Rory on 2017-03-31.
 */
public class TestAll {
    private WorkerInterface worker;
    private WorkerInterface superWorker;
    private Manager manager;
    private boolean test = false;


    @org.junit.Before
    public void setUp() throws Exception
    {
        worker = new Worker();
        superWorker = new Worker();
        manager = new Manager();


    }

    @org.junit.Test
    public void work() throws Exception
    {
        try {
            worker.work();
            superWorker.work();
            test = true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);


    }

    @org.junit.Test
    public void eat() throws Exception
    {
        try {
            worker.eat();
            superWorker.eat();
            test = true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);


    }

}
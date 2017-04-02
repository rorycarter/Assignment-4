package com.carter.ispObey;

import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by Rory on 2017-03-31.
 */
public class TestWork {


    private Manager manager;
    private WorkableInterface worker;
    private WorkableInterface superWorker;
    private WorkableInterface robot;
    private boolean test;

    @Before
    public void setUp() throws Exception {
        manager = new Manager();
        worker = new Worker();
        superWorker = new SuperWorker();
        robot = new Robot();

    }

    @Test
    public void work() throws Exception {
        try {
            worker.work();
            superWorker.work();
            robot.work();
            test = true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);
    }

    }


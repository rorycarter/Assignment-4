package com.carter.ispViolate;

/**
 * Created by Rory on 2017-03-31.
 */
public class Run
{
    public static void main(String[] args)
    {
        WorkerInterface worker = new Worker();
        WorkerInterface superWorker = new Worker();
        Manager manager = new Manager();
        manager.setWorker(worker);
        manager.manage();
        manager.setWorker(superWorker);
        manager.manage();
    }
}

package com.carter.ispViolate;

/**
 * Created by Rory on 2017-03-31.
 */
public class Manager {
    WorkerInterface worker;

    public void setWorker(WorkerInterface worker)
    {
        this.worker = worker;
    }

    public void manage()
    {
        worker.work();
        worker.eat();
    }
}

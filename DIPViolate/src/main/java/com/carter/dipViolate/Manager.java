package com.carter.dipViolate;

/**
 * Created by Rory on 2017-03-30.
 */
public class Manager {
    Worker workerObj;

    public void setWorker(Worker workerObject)
    {
        this.workerObj = workerObject;
    }

    public void manage()
    {
        workerObj.work();
    }
}

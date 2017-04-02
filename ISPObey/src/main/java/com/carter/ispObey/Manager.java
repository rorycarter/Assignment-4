package com.carter.ispObey;

/**
 * Created by Rory on 2017-03-31.
 */
public class Manager
{

    WorkableInterface worker;

    public void setWorker(WorkableInterface w) {
        worker=w;
    }

    public void manage() {
        worker.work();
    }
}

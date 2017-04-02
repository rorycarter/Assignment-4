package com.carter.dipObey;

/**
 * Created by Rory on 2017-03-30.
 */
public class Manager {
    IWorker work;
    public void setWorker(IWorker iw)
    {

        work=iw;
    }
    public void manage() {
        work.work();
    }
}

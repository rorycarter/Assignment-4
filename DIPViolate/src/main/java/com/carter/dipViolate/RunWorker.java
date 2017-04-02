package com.carter.dipViolate;

/**
 * Created by Rory on 2017-03-30.
 */
public class RunWorker {
    public static void main(String[] args)
    {
        Manager managerObj = new Manager();
        Worker workerObj = new Worker();
        SuperWorker superWorkerObject = new SuperWorker();

        managerObj.setWorker(workerObj);
        managerObj.manage();
        superWorkerObject.work();
    }
}

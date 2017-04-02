package com.carter.ispObey;

/**
 * Created by Rory on 2017-03-31.
 */
public class RunIsp {
    public static void main(String[] args) {

        Manager manager = new Manager();
        WorkableInterface worker = new Worker();
        WorkableInterface superWorker = new SuperWorker();
        WorkableInterface robot = new Robot();
        manager.setWorker(superWorker);
        manager.manage();
        manager.setWorker(worker);
        manager.manage();
        manager.setWorker(robot);
        manager.manage();
    }
}

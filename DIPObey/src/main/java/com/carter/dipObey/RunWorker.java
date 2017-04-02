package com.carter.dipObey;

/**
 * Created by Rory on 2017-03-30.
 */
public class RunWorker
{
    public static void main(String[] args)
    {
        IWorker worker = new Worker();
        IWorker superWorker = new SuperWorker();
        Manager manager = new Manager();
        manager.setWorker(worker);
        manager.manage();
        manager.setWorker(superWorker);
        manager.manage();
    }
}

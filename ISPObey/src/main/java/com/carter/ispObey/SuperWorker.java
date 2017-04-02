package com.carter.ispObey;

/**
 * Created by Rory on 2017-03-31.
 */
public class SuperWorker implements WorkerInterface, FeedableInterface {
    public void work() {
        System.out.println("Working twice as hard!!");
    }
    public void eat() {
        System.out.println("Eating a sandwich");
    }
}

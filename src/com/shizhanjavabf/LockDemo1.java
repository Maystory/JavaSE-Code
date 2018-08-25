package com.shizhanjavabf;

/**
 * Created by Maven on 2018/8/25.
 * Description:
 */
public class LockDemo1 {

    public static void main(String[] args) throws Exception{
        ReenterLockThread reenterLockThread = new ReenterLockThread();

        Thread t1 = new Thread(reenterLockThread);
        Thread t2 = new Thread(reenterLockThread);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
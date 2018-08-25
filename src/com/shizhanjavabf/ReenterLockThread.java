package com.shizhanjavabf;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Maven on 2018/8/25.
 * Description:
 */
public class ReenterLockThread implements Runnable {

    public ReentrantLock lock = new ReentrantLock();
    public static int i = 0;

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            try {
                lock.lock();
                i++;
                System.out.println(Thread.currentThread().getName() + ":i 的值为" + i);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

    }

    public static void main(String[] args) throws Exception {
        ReenterLockThread reenterLockThread = new ReenterLockThread();
        Thread t1 = new Thread(reenterLockThread);
        Thread t2 = new Thread(reenterLockThread);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("最终的为:" + i);
    }
}
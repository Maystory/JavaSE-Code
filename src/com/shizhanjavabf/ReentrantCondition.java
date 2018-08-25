package com.shizhanjavabf;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Maven on 2018/8/25.
 * Description:
 */
public class ReentrantCondition implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();
    @Override
    public void run() {
        try {
            lock.lock();
            condition.await();
            System.out.println("thread is going on ....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
    public static void main(String[] args) throws InterruptedException {
        ReentrantCondition reentrantCondition = new ReentrantCondition();
        Thread t1 = new Thread(reentrantCondition);
        t1.start();
        Thread.sleep(2000);
        lock.lock();
        condition.signal();
        lock.unlock();

    }
}
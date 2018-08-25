package com.shizhanjavabf;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Maven on 2018/8/25.
 * Description:
 */
public class TimeLock implements Runnable {

    public ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {

        try {
            /**
             * 请求锁的过程中最多等待5秒 ，超时返回false
             */
            if (lock.tryLock(5, TimeUnit.SECONDS)) {
                /**
                 * 占有锁的线程休眠了6秒 后面的肯定获取不到
                 */
                Thread.sleep(6000);
            } else {
                System.out.println(Thread.currentThread().getName() + ": failed to get the lock ...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }

    }

    public static void main(String[] args) {
        TimeLock timeLock = new TimeLock();
        Thread t1 = new Thread(timeLock);
        Thread t2 = new Thread(timeLock);
        t1.start();
        t2.start();
    }
}
package com.shizhanjavabf;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Maven on 2018/8/25.
 * Description:线程3:获取了锁
 * 线程1:获取了锁
 * 线程2:获取了锁
 * 线程3:获取了锁
 * 线程1:获取了锁
 * 线程2:获取了锁
 * 线程3:获取了锁
 * 线程1:获取了锁
 */
public class FairLock implements Runnable {

    public static ReentrantLock fairLock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true){
            try {
                fairLock.lock();
                System.out.println(Thread.currentThread().getName()+":获取了锁");
            } finally {
                fairLock.unlock();
            }
        }



    }

    public static void main(String[] args) {
        FairLock fairLock = new FairLock();
        Thread t1 = new Thread(fairLock, "线程1");
        Thread t2 = new Thread(fairLock, "线程2");
        Thread t3 = new Thread(fairLock, "线程3");
        t1.start();
        t2.start();
        t3.start();

    }
}
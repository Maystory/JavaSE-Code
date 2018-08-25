package com.shizhanjavabf;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Maven on 2018/8/25.
 * Description:
 */
public class IntLock implements Runnable {

    public ReentrantLock lock1 = new ReentrantLock();
    public ReentrantLock lock2 = new ReentrantLock();

    int lock;

    public IntLock(int lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        try {
            if (lock == 1) {
                lock1.lockInterruptibly();
                Thread.sleep(1000);
                lock2.lockInterruptibly();
            } else {
                lock2.lockInterruptibly();
                Thread.sleep(1000);
                lock1.lockInterruptibly();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock1.isHeldByCurrentThread()) {
                lock1.unlock();
            }
            if (lock2.isHeldByCurrentThread()) {
                lock2.unlock();
            }
            System.out.println(Thread.currentThread().getName() + "线程退出!");
        }

    }

    public static void main(String[] args) {
        IntLock intLock1 = new IntLock(1);
        IntLock intLock2 = new IntLock(2);

        Thread t1 = new Thread(intLock1);
        Thread t2 = new Thread(intLock2);
        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.interrupt();
    }
}
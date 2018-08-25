package com.shizhanjavabf;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Maven on 2018/8/25.
 * Description:
 */
public class TryLock implements Runnable {

    public static ReentrantLock lock1 = new ReentrantLock();
    public static ReentrantLock lock2 = new ReentrantLock();

    int lock;

    public TryLock(int lock) {
        this.lock = lock;
    }


    @Override
    public void run() {
        if (lock == 1) {
            while (true) {
                if (lock1.tryLock()) {
                    try {
                        Thread.sleep(500);
                        if (lock2.tryLock()) {
                            try {
                                System.out.println(Thread.currentThread().getName() + ": has get lock and finish job ");
                                return;
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } catch (InterruptedException e) {
                    } finally {
                        lock1.unlock();
                    }

                }
            }
        } else {
            while (true) {
                if (lock2.tryLock()) {
                    try {
                        Thread.sleep(500);
                        if (lock1.tryLock()) {
                            try {
                                System.out.println(Thread.currentThread().getName() + ": has get lock and finish job ");
                                return;
                            } finally {
                                lock1.unlock();
                            }
                        }
                    } catch (InterruptedException e) {
                    } finally {
                        lock2.unlock();
                    }

                }

            }


        }
    }

    public static void main(String[] args) {
        TryLock tryLock1 = new TryLock(1);
        TryLock tryLock2 = new TryLock(2);
        new Thread(tryLock1).start();
        new Thread(tryLock2).start();
    }
}
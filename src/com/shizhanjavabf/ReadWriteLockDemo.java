package com.shizhanjavabf;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Maven on 2018/8/26.
 * Description:
 * 使用读写锁耗时：2135毫秒
 * 使用普通锁耗时：19171毫秒
 */
public class ReadWriteLockDemo {
    private static Lock lock = new ReentrantLock();
    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static Lock readLock = readWriteLock.readLock();
    private static Lock writeLock = readWriteLock.writeLock();
    private static CountDownLatch countDownLatch = new CountDownLatch(20);


    private int value;

    /**
     * 模拟读操作
     *
     * @param lock
     * @return
     * @throws Exception
     */
    public Object handleRead(Lock lock) throws Exception {
        try {
            lock.lock();
            Thread.sleep(1000);
            return value;
        } finally {
            lock.unlock();
            countDownLatch.countDown();
        }
    }

    /**
     * 模拟写操作
     *
     * @param lock
     * @param index
     * @throws Exception
     */
    public void handleWrite(Lock lock, int index) throws Exception {
        try {
            lock.lock();
            Thread.sleep(500);
            value = index;
        } finally {
            lock.unlock();
            countDownLatch.countDown();
        }

    }

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        final ReadWriteLockDemo demo = new ReadWriteLockDemo();

        Runnable readRunnable = () -> {
            try {
//                demo.handleRead(readLock);
                demo.handleRead(lock);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Runnable writeRunnable = () -> {
            try {
//                demo.handleWrite(writeLock, new Random().nextInt());
                demo.handleWrite(lock, new Random().nextInt());
            } catch (Exception e) {
                e.printStackTrace();
            }
        };


        for (int i = 0; i < 18; i++) {
            new Thread(readRunnable).start();
        }

        for (int i = 18; i < 20; i++) {
            new Thread(writeRunnable).start();
        }
        countDownLatch.await();
//        System.out.println("使用读写锁耗时：" + (System.currentTimeMillis() - start));
        System.out.println("使用普通锁耗时：" + (System.currentTimeMillis() - start));


    }

}
package com.shizhanjavabf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maven on 2018/8/26.
 * Description:
 *
 * 只允许5个线程同时访问 每结束一个任务 释放一个任务进来
 */
public class SemapDemo implements Runnable {

    final Semaphore semaphore = new Semaphore(5);


    @Override
    public void run() {
        try {
            //获得一次许可
            semaphore.acquire();
            //模拟的耗时操作
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName() + "：线程执行结束。。。。");
            //释放一个许可
            semaphore.release();
            System.out.println("semaphore relese the lock ....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newFixedThreadPool(20);

        final SemapDemo semapDemo = new SemapDemo();
        for (int i = 0; i < 20; i++) {
            executorService.submit(semapDemo);
        }
    }
}
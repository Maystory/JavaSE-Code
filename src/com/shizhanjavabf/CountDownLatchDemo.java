package com.shizhanjavabf;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maven on 2018/8/26.
 * Description:
 * <p>
 * check complete ...
 * check complete ...
 * check complete ...
 * check complete ...
 * check complete ...
 * check complete ...
 * check complete ...
 * check complete ...
 * check complete ...
 * check complete ...
 * all thread exec the main runs......
 * <p>
 * 等待其他线程完成后某个线程才开始执行
 */
public class CountDownLatchDemo implements Runnable {

    static final CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(10);
    static final CountDownLatchDemo DEMO = new CountDownLatchDemo();


    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(new Random(5).nextInt());
            System.out.println(" check complete ...");
            COUNT_DOWN_LATCH.countDown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception {
        ExecutorService executorService =
                Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executorService.submit(DEMO);

        }
        //主线程等待10个线程完成后才进行任务
        COUNT_DOWN_LATCH.await();
        System.out.println(" all thread exec the main runs......");
        executorService.shutdown();
    }
}
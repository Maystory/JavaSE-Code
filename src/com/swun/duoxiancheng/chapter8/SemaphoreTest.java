package com.swun.duoxiancheng.chapter8;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-03-23 20:48
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 控制线程并发访问资源的数量
 */
public class SemaphoreTest {
    private static final int COUNT = 30;
    private static ExecutorService threadool = Executors.newFixedThreadPool(COUNT);
    private static  Semaphore semaphore =  new Semaphore(10);

    public static void main(String[] args) {
        for (int i = 0; i < COUNT; i++) {
            threadool.execute(()->{
                try {
                    //获取一个访问资源的许可
                    semaphore.acquire();
                    System.out.println("save data --"+Thread.currentThread().getName());
                    //释放许可
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }
       // threadool.shutdown();
    }
}
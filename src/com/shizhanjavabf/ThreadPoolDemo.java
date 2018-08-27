package com.shizhanjavabf;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Maven on 2018/8/26.
 * Description:
 */
public class ThreadPoolDemo {

    public static class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis() + " :Thred ID :" + Thread.currentThread().getName());
            try {
                Thread.sleep(new Random(20).nextInt());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        for (int i = 0; i < 20; i++) {
            executorService.submit(task);
        }
    }
}
package com.shizhanjavabf;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maven on 2018/8/27.
 * Description:
 */
public class ExtThreadPool {

    public static class MyTask implements Runnable {
        private String name;

        public MyTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("正在执行：" + Thread.currentThread().getId() + ",Task Name is :" + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>()) {
            @Override
            protected void beforeExecute(Thread t, Runnable r) {
                System.out.println("线程池准备执行：" + ((MyTask) r).name);
            }

            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                System.out.println("线程池执行完成：" + ((MyTask) r).name);
            }

            @Override
            protected void terminated() {
                System.out.println("线程池退出。。。。");
            }
        };

        for (int i = 0; i < 5; i++) {
            MyTask myTask = new MyTask("我的线程-" + i);
            threadPoolExecutor.execute(myTask);
            Thread.sleep(100);
        }

        threadPoolExecutor.shutdown();
        /**
         * 获取机器的cpu数量
         */
        int cpus = Runtime.getRuntime().availableProcessors();
        System.out.println("【此机器的cup数量是：】" + cpus);
    }
}
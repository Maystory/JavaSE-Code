package com.shizhanjavabf;

import java.util.concurrent.*;

/**
 * Created by Maven on 2018/8/27.
 * Description:线程的拒绝策略
 */
public class RejectThreadPoolDemo {

    public static class MyTask implements Runnable {


        @Override
        public void run() {
            System.out.println(System.currentTimeMillis() +
                    ":ThreadId  name is :" + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public static void main(String[] args) throws Exception {
        MyTask myTask = new MyTask();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,
                5, 0L,TimeUnit.SECONDS
                , new LinkedBlockingQueue<Runnable>(10)
                , new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println(r.toString() + "is discard");
            }
        });

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            threadPoolExecutor.submit(myTask);
            Thread.sleep(10);
        }
    }
}
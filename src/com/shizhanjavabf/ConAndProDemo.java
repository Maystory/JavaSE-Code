package com.shizhanjavabf;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Maven on 2018/8/30.
 * Description:
 */
public class ConAndProDemo {
    public static void main(String[] args)throws Exception {
        BlockingQueue<PCData> queue = new LinkedBlockingQueue<>(10);
        Producer producer1 = new Producer(queue);
        Producer producer2 = new Producer(queue);
        Producer producer3 = new Producer(queue);

        Consumer consumer1 = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);
        Consumer consumer3 = new Consumer(queue);

        ExecutorService th = Executors.newCachedThreadPool();
        th.execute(producer1);
        th.execute(producer2);
        th.execute(producer3);

        th.execute(consumer1);
        th.execute(consumer2);
        th.execute(consumer3);

        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        producer1.stop();
        producer2.stop();
        producer3.stop();
        Thread.sleep(3000);

        th.shutdown();
    }
}
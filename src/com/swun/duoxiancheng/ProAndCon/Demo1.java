package com.swun.duoxiancheng.ProAndCon;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo1 {

    public static BlockingQueue<Message> queue  = new ArrayBlockingQueue(1000);

    public static void main(String args[]){
        Message message = new Message();
        Thread t1 =  new Thread(new Producer(message));
        t1.setName("Producer-Thread");
        t1.start();
        Thread t2 = new Thread(new Consumer(message));
        t2.setName("Consumer-Thread");
        t2.start();

    }
}

package com.swun.duoxiancheng.queue;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-03-28 14:04
 */

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 各种阻塞队列
 */
public class BlockIngTest {
    public static void main(String[] args) {

        ArrayBlockingQueue fair = new ArrayBlockingQueue<>(1000,true);
       // fair.add(new Object());
        fair.offer(new Object());

    }

}
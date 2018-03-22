package com.swun.duoxiancheng.binfaart;

import java.util.concurrent.CountDownLatch;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-03-22 17:22
 */
public class CountLachTest {
    //初始化计数器个数
    static CountDownLatch c = new CountDownLatch(2);

    /**
     * 当调用count()方法时,计数器减1,直到计数器减到0 否则c.await()方法会阻塞当前线程
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        new Thread(() -> {
            System.out.println("1111111111");
            c.countDown();
            System.out.println("2222222222");
            // c.countDown();

        }).start();
        c.await();
        System.out.println("3333333333");
    }
}
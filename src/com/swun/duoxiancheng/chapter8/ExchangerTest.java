package com.swun.duoxiancheng.chapter8;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-03-23 20:34
 */

/**
 * 线程间交换数据的类
 */
public class ExchangerTest {
    private static final Exchanger<String> exchenger = new Exchanger<>();
    private static final ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) throws Exception {
        //第一个线程
        threadPool.execute(() -> {
            //录入银行流水
            String A = "银行流水A";
            try {
                exchenger.exchange(A);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        //第二个线程
        threadPool.execute(() -> {
            String B = "银行流水B";
            try {
                String A = exchenger.exchange(B);
                System.out.println("A is " + A + ", " + "B is " + B);
                System.out.println(A.equals(B));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadPool.shutdown();
    }
}
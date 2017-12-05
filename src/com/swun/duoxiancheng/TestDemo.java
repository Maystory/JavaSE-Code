package com.swun.duoxiancheng;

import org.junit.Test;

/**
 * 描述:
 * test
 *
 * @outhor my
 * @create 2017-12-05 15:42
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();

            Thread.sleep(1000);

            ThreadC c = new ThreadC(b);
            c.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
package com.shizhanjavabf;

import java.util.ArrayList;

/**
 * Created by Maven on 2018/8/29.
 * Description:
 */
public class ArrayListMutiDemo {
    static ArrayList<Integer> al = new ArrayList<>(10);

    public static class AddThread implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                al.add(i);
            }
        }
    }

    public static void main(String[] args)throws Exception {
        System.out.println(Integer.toBinaryString(23)); //10111
        Thread t1 = new Thread(new AddThread());
        Thread t2 = new Thread(new AddThread());
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("【结果】："+al.size());


    }

 }
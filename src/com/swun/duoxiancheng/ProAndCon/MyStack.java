package com.swun.duoxiancheng.ProAndCon;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * stack
 *
 * @outhor my
 * @create 2017-12-06 15:09
 */
public class MyStack {

    private List<String> list = new ArrayList<>();

    synchronized public void add() {
        while (list.size() != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        list.add(new String("haha"));
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("生产了一个,已经有" + list.size() + "个了");

        notifyAll();
    }


    synchronized public void get() {
        while (list.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(0);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("生产了一个,已经有" + list.size() + "个了");
            notifyAll();
        }
    }

}
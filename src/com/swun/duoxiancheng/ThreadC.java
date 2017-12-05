package com.swun.duoxiancheng;

/**
 * 描述:
 * c
 *
 * @outhor my
 * @create 2017-12-05 15:39
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
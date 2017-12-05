package com.swun.duoxiancheng;

/**
 * 描述:
 * a
 *
 * @outhor my
 * @create 2017-12-05 15:30
 */
public class ThreadA extends Thread {
    public Thread b ;
    public ThreadA(Thread b) {
        this.b = b;

    }

    @Override
    public void run() {
        synchronized (b){
            b.start();
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
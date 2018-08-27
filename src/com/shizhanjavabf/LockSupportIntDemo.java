package com.shizhanjavabf;

import java.util.concurrent.locks.LockSupport;

/**
 * Created by Maven on 2018/8/26.
 * Description:
 */
public class LockSupportIntDemo {


    public static Object u = new Object();
    static ChangeObjectThread t1 = new ChangeObjectThread("t1");
    static ChangeObjectThread t2 = new ChangeObjectThread("t2");


    public static class ChangeObjectThread extends Thread {

        public ChangeObjectThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (u) {
                System.out.println("in :" + getName());
                LockSupport.park();
                System.out.println("park in:" + getName());
                if (Thread.interrupted()) {
                    System.out.println(getName() + ":被中断了。。。");
                }
            }
            System.out.println(getName() + " :执行结束。。。");

        }
    }

    public static void main(String[] args) throws Exception {
        t1.start();
        System.out.println("t1 start..");
        Thread.sleep(1000);
        t2.start();
        System.out.println("t2 start..");
        t1.interrupt();
        System.out.println("t1 interrupte..");
        LockSupport.unpark(t2);


    }
}
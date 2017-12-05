package com.swun.duoxiancheng;

/**
 * 描述:
 * b
 *
 * @outhor my
 * @create 2017-12-05 15:34
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        System.out.println("b begin time is ="+ System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("b end time is " + System.currentTimeMillis());
    }
   synchronized public void bService(){
        System.out.println("打印了bService方法 time = "+System.currentTimeMillis());
   }
}
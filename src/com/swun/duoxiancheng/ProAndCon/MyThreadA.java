package com.swun.duoxiancheng.ProAndCon;

/**
 * 描述:
 *
 * @outhor my
 * @create 2017-12-06 15:44
 */
public class MyThreadA extends Thread {
    public MyService myService;
    public MyThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(200);
                myService.set();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
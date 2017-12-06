package com.swun.duoxiancheng.ProAndCon;

/**
 * 描述:
 *
 * @outhor my
 * @create 2017-12-06 15:46
 */
public class MyThreadB extends Thread {

    public MyService myService;
    public MyThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(200);
                myService.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
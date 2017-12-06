package com.swun.duoxiancheng.ProAndCon;

public class Consumer implements Runnable {
    private Message message ;
    public Consumer(){}
    public Consumer(Message message){
        this.message = message;
    }

    @Override
    public void run() {
        for (int i=0;i<50;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.message.get();
        }
    }
}

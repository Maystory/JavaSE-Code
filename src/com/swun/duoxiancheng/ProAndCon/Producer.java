package com.swun.duoxiancheng.ProAndCon;

public class Producer implements Runnable {
    private  Message message ;
    public Producer(){}
    public Producer(Message message){
        this.message = message;
    }
    @Override
    public void run() {
        for (int i=0;i<50;i++){
            if (i%2==0){
                this.message.set("A","---------");
            }else {
                this.message.set("B","..........");
            }
        }
    }
}

package com.swun.duoxiancheng.ProAndCon;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    private  Message message ;
    public Producer(){}
    public Producer(Message message){
        this.message = message;
    }
    @Override
    public void run() {
        while(true){
            buildMessage();
        }

    }


    public void buildMessage() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Message message = new Message();
        message.setTitle("message");
        message.setContent(UUID.randomUUID().toString());
        Demo1.queue.add(message);
    }
}

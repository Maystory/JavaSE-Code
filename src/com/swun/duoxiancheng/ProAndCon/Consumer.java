package com.swun.duoxiancheng.ProAndCon;

import java.util.Objects;
import java.util.UUID;

public class Consumer implements Runnable {
    private Message message ;
    public Consumer(){}
    public Consumer(Message message){
        this.message = message;
    }

    @Override
    public void run() {
        while (true){
            getMessage();
        }

    }


    public void getMessage() {
        Message message = null;
        try {
            message = Demo1.queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(!Objects.isNull(message)){
            System.out.println(message.getTitle()+"|"+message.getContent());
        }

    }
}

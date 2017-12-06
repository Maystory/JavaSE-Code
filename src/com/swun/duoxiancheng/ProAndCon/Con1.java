package com.swun.duoxiancheng.ProAndCon;

/**
 * 描述:
 *
 * @outhor my
 * @create 2017-12-06 15:17
 */
public class Con1 extends Thread{
    private MyStack myStack;
    public Con1(MyStack myStack){
        this.myStack = myStack;
    }

    @Override
    public void run() {
        myStack.get();
        System.out.println("Con1------->run");
    }

}
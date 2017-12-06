package com.swun.duoxiancheng.ProAndCon;

/**
 * 描述:
 *
 * @outhor my
 * @create 2017-12-06 15:15
 */
public class Pro1 extends Thread {
    private MyStack myStack;
    public Pro1(MyStack myStack){
        this.myStack = myStack;
    }

    @Override
    public void run() {
        myStack.add();
        System.out.println("Pro------->run");
    }
}
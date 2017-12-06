package com.swun.duoxiancheng.ProAndCon;

/**
 * 描述:
 *
 * @outhor my
 * @create 2017-12-06 15:18
 */
public class Demo2 {
    public static void main(String args[]){
        MyStack myStack = new MyStack();

        Pro1 pro1 = new Pro1(myStack);
        Con1 con1 = new Con1(myStack);
        pro1.start();
        pro1.start();
    }

}
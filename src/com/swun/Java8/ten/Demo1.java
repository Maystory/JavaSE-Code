package com.swun.Java8.ten;

public class Demo1 {
    public static void main(String args[]) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("before Java8  ");
            }
        }).start();



        new Thread(() -> System.out.println("easy Java8 ")).start();
    }
}

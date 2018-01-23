package com.swun.Java8.Lambda;

import org.junit.Test;

import java.util.Arrays;

/**
 * lambda表达式的变量
 */
public class LambdaTest2 {

    //自由变量在lambda是不可以被修改的 final (操作自由变量的代码就是闭包)

    public void repeatPrint(String content, int times) throws Exception {
        Runnable runnable = () -> {
            for (int i = 0; i < times; i++) {
                System.out.println(content);

            }
            //this 指向 本类LambdaTest2
            System.out.println(this);
        };
        new Thread(runnable).start();
        Thread.sleep(2000);
    }

    @Test
    public void Test1() throws Exception {
        this.repeatPrint("haha", 3);
    }

    /**
     * 方法引用
     */
    @Test
    public void test2() {
        Integer[] is = new Integer[]{32, 3, 3, 4, 5, 6, 7, 432, 23};
        //方法引用
        Arrays.sort(is, Integer::compare);
        System.out.println(Arrays.toString(is));
    }

}

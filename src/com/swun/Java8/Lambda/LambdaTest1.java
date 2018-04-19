package com.swun.Java8.Lambda;

import com.swun.Java8.stream.User;
import org.junit.Test;

import java.util.Arrays;

/**
 * lambda 表达式入门
 */
public class LambdaTest1 {
    /**
     * 打印出按年龄升序的User的名字
     */
    @Test
    public void test1() {
        User[] users = new User[]{new User("张三", 20), new User("李四", 30), new User("王五", 40)};

        Arrays.sort(users, (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));

        System.out.println(Arrays.toString(users));
    }

    /**
     * Runnable 的lambda
     */
    @Test
    public void test2() throws Exception {
        new Thread(() -> System.out.println("hello Lamda")).start();
        Thread.sleep(200);

        System.out.println("---华丽的分割线---");

        //lambda表达式可以赋值给一个引用
        Runnable runnable = () -> System.out.println("我是lambda  run 的引用哦");

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();

        Thread.sleep(2000);
    }

}

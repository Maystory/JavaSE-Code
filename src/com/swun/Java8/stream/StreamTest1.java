package com.swun.Java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * 如何创建一个Stream
 */
public class StreamTest1 {
    /**
     * 使用Arrays.stream() 方法来创建一个Stream
     */
    @Test
    public void test1() {
        //普通数组变成stream
        int[] ints = new int[]{3, 4, 5, 2, 85, 4};
        IntStream in = Arrays.stream(ints);

        //对象的数组变成stream
        User[] users = new User[]{new User("mf", 22), new User("rcq", 16)};
        Stream<User> userStream = Arrays.stream(users);

    }

    /**
     * 使用Stream.of() 方法来创建一个Stream
     */
    @Test
    public void test2() {
        int[] ints = new int[]{3, 4, 5, 2, 85, 4};
        User[] users = new User[]{new User("mf", 22), new User("rcq", 16)};

        //错误做法
//        Stream<int[]> ints1 = Stream.of(ints);
        //这个Stream会涉及到拆箱和包厢
        Stream<Integer> stream = Stream.of(1, 3, 2, 5, 6, 3345, 6);

    }

    /**
     * 集合类型转换成Stream
     */
    @Test
    public void test3() {
        List<String> stringList = Arrays.asList(new String[]{"aa", "bb", "cc"});

        //直接调用Stream方法
        Stream<String> stream = stringList.stream();

        //得到并行Stream的方法
        Stream<String> parallelStream = stringList.parallelStream();


    }

    /**
     * 创建一个空的Stream
     */
    @Test
    public void test4() {
        Stream<Object> empty = Stream.empty();
        System.out.println(empty);

    }

    /**
     * 创建无限大的Stream 限制长度
     */
    @Test
    public void test5() {
        Stream<String> generate = Stream.generate(() -> "haha");

        //把IDEA 搞奔溃了  无限的打印 haha
//        generate.forEach(System.out::println);
        //限制一下 只打印10个
        //limit() :从流的前端截取10个数据  延迟操作
        generate.limit(10).forEach(System.out::println);
        //创建10个User
        Stream.generate(() -> new User("mf", 22)).limit(10).forEach(System.out::println);
        //创建随机数
        Stream.generate(Math::random).limit(10).forEach(System.out::println);


    }

    /**
     * 产生规律的数据 iterate()
     */
    @Test
    public void test6() {
        //种子是 0
        Stream.iterate(0, x -> x + 1).limit(10).forEach(System.out::println);
    }

    /**
     * 筛选出年龄大于25的人 的名字
     */
    @Test
    public void test7(){
        User[] users = new User[]{new User("张三", 20), new User("李四", 30), new User("王五1", 40),new User("王五2", 40),new User("王五3", 40),new User("王五", 40),new User("王五", 40)};
        List<User> userList = Arrays.asList(users);
        List<String> stringList = userList.stream()
                .filter((user) -> user.getAge() > 25)
                .map(User::getUsername)
                .limit(4)
                .collect(toList());
        for (String s : stringList) {
            System.out.println(s);
        }
        //
    }
}


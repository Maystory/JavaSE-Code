package com.swun.functioninterface;

import com.google.common.collect.Lists;
import com.javabase.day01reflection.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * 函数式编程测试
 *
 * @author Maven
 * @since 2018-12-08 14:03
 */
public class Funtest {
    public static void main(String[] args) {
        // Predicate<Integer> isBig = o->o>5;
        //
        List<Integer> together = Stream.of(Arrays.asList(1, 2, 4, 3), Arrays.asList(3, 4))
                .flatMap(Collection::stream)
                .collect(toList());
        System.out.println(together);

        //取出年龄最小值的元素
        ArrayList<User> userList = Lists.newArrayList(new User("meifan", "24"),
                new User("meifan-1", "24"),
                new User("meifan-2", "67"),
                new User("meifan-2", "2"),
                new User("meifan-4", "76"));
        userList.stream().min(Comparator.comparing(User::getAge)).ifPresent(System.out::println);

        Map<String, String> userMap = new HashMap<>(16);

        System.out.println("--------华丽的分割线----------");

        //reduce :归纳于  累加的操作
        System.out.println(Stream.of(1, 2, 3, 4, 5).reduce(0, (result, e) -> result + e));
        System.out.println("--------华丽的分割线----------");

        // 静态统计
        IntSummaryStatistics intSummaryStatistics = userList.stream().mapToInt(user -> Integer.parseInt(user.getAge())).summaryStatistics();
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println("--------华丽的分割线----------");

        //求平均
        System.out.println(userList.stream().collect(averagingInt(o -> Integer.parseInt(o.getAge()))));
        System.out.println("--------华丽的分割线----------");

        //分流
        Map<Boolean, List<User>> splitStreamResultMap = userList.stream().collect(partitioningBy((o) -> o.getName().equals("meifan-2")));
        splitStreamResultMap.forEach((k, v) -> System.err.println(k + ":" + v));
        System.out.println("--------华丽的分割线----------");

        //将结果练成字符串
        String resultStr = userList.stream().map(User::getName).collect(Collectors.joining("*"));
        System.err.println(resultStr);
        System.out.println("--------华丽的分割线----------");
        //字符串的连接
        // userList.stream().map(User::getName).collect(new StringCollector())

        // 操作map
        System.out.println("--------华丽的分割线操作map----------");
        userMap.computeIfAbsent("mf", (m) -> "xxxxx" + m);
        userMap.forEach((k, v) -> System.out.println(k + "," + v));
        System.out.println("--------华丽的分割线操作map----------");

        //数组操作 i数组下标
        int[] dValues = new int[10];
        Arrays.parallelSetAll(dValues, i -> i * 5);
        System.err.println(Arrays.toString(dValues));
        System.out.println("--------华丽的分割线----------");
        String result = "sfjlsdfjl";
        String[] arrs = result.split("修改为");
        System.err.println(arrs[0]+",");


    }
}
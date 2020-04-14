package com.swun.se;

import com.swun.Java8.stream.User;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <p>
 *
 * </p>
 *
 * @author mf
 * @date 2019-09-14 10:45
 */
public class Java8Demo {
    public static void main(String[] args) {
        User u = new User();
        u.setAge(11);
        u.setUsername("mf");
        mt(u);
        System.out.println(u);

    }


    private static void mt(User user) {
        User temp = user;
        temp.setAge(99);
        temp.setUsername("xixi");
    }

}

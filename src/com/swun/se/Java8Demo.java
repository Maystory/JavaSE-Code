package com.swun.se;

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
        int[] nums = {3, 5, 546, -45, 36, 2};


        int asInt = IntStream.of(nums).max().getAsInt();
        System.out.println(asInt);

    }

}

package com.swun.thinkinjava;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>
 *
 * </p>
 *
 * @author mf
 * @date 2019-07-11 17:52
 */
public class TestDemo1 {
    public static void main(String[] args) {
        List<String> nums = new ArrayList<>(1000);
        Random random = new Random(34);
        for (int i = 0; i < 1000; i++) {
            int l = random.nextInt(12345678);
            BigDecimal temp = new BigDecimal(String.valueOf(l)).divide(new BigDecimal(101), 4, RoundingMode.FLOOR);
            nums.add(temp.toString());

        }

        System.out.println(nums);

    }
}

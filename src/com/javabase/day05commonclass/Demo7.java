package com.javabase.day05commonclass;

import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author Maven
 * @date 2018/9/28
 * Description:
 */
public class Demo7 {
    public static void main(String[] args) {
        // System.out.println(Runtime.getRuntime().availableProcessors());
        // System.out.println(Runtime.getRuntime().totalMemory());

        // String str = "adcdefg,hijk,lmn";
        // /**
        //  * 从某个位置，截取到某个位置
        //  * 前闭后开
        //  */
        //
        // System.out.println(str.substring(1, 5));
        // /**
        //  * 从某个位置截取到最后
        //  */
        // System.out.println(str.substring(2));
        //
        // System.out.println(str.charAt(5));
        // System.out.println(str.lastIndexOf("j"));
        //
        // String[] split = str.split(",");
        // System.out.println(Arrays.toString(split));

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.AM));
    }
}
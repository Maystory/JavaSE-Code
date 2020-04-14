package com.javabase.day07fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author mf
 * @date 2019-12-05 23:16
 */
public class GenericsTypeTest {
    public static void main(String[] args) {

        // List<? super Apple> f1 = new ArrayList<Apple>();    //1
        // List<? super Apple> f1 = new ArrayList<Food>();     //2
        // List<? super Apple> f1 = new ArrayList<RedApple>() ;  //3

        //放入数据
        // f1.add(new Apple());   // 1
        // // f1.add(new Fruit());   // 2
        // f1.add(new RedApple());   // 3
        // f1.add(null); //4


        //取出数据
        // Object o = f1.get(0);
        // Food a = (Object) o;  // 5



    }
}

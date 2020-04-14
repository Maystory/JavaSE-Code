package com.javabase.day07fanxing;

/**
 * <p>
 *
 * </p>
 *
 * @author mf
 * @date 2019-12-05 22:47
 */
public class ArrayTest {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];   //  compile success
        fruit[0] = new Apple();
        // fruit[1] = new Fruit(); //   java.lang.ArrayStoreException
        fruit[2] = new RedApple();
        // fruit[3] = new Orange();  //java.lang.ArrayStoreException
        RedApple r = (RedApple)fruit[2] ;   // 6
        System.out.println(r);

    }
}

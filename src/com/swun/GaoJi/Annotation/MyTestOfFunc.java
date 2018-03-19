package com.swun.GaoJi.Annotation;

import java.lang.reflect.Method;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-03-19 15:16
 */
public class MyTestOfFunc {

    public void fun(){
        Class myObjectClass = myTest.class;
        Method[] declaredMethods = myObjectClass.getDeclaredMethods();
        for (Method method:declaredMethods) {
            System.out.println(method.getName());
        }
    }



}
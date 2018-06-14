package com.swun.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-06-14 11:13
 */
public class MyiInvocationHandler implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        DogUtil dogUtil = new DogUtil();
        dogUtil.method1();
        Object result = method.invoke(target, args);
        dogUtil.method2();
        return result;
    }
}
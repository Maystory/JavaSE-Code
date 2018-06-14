package com.swun.proxy;

import java.lang.reflect.Proxy;

/**
 * 描述:
 * 动态代理设计模式
 *
 * @outhor mf
 * @create 2018-06-14 10:57
 */
public class ProxyDemo {
    public static void main(String[] args) {
        MyiInvocationHandler handler = new MyiInvocationHandler();
        GunDog target = new GunDog();

        handler.setTarget(target);
        Dog o = (Dog) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);
        o.info();
        o.run();

    }

}
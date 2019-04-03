package com.designpattern.Wrapper;

import java.sql.SQLOutput;

/**
 * @author mf
 * @since 2019-03-14 23:05
 * 设计原则 : 类应该对扩展开发，对修改关闭
 * 装饰者模式：动态的将责任附加到对象上。若要扩展功能，装饰者提供了比继承更富有弹性的方案。
 * 模型： 组件接口 实际组件 装饰组件 （责任链）
 */
public class WrapperTest {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(" 没加摩卡的价格是："+beverage.cost());

        Beverage wrapperB = new Moka(beverage);
        System.out.println("加一波摩卡："+wrapperB.cost());


        Beverage wrapperC = new Moka(wrapperB);
        System.out.println("加二波摩卡："+wrapperC.cost());
    }





}
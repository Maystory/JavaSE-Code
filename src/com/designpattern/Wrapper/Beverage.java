package com.designpattern.Wrapper;

/**
 * @author mf
 * @since 2019-03-14 23:08
 * 抽象的装饰基础组件
 */
public abstract class Beverage {
    String description = " default description";

    abstract double cost();

    String getDescription() {
        return description;
    }
}
package com.designpattern.stratery;

/**
 * Created by Maven on 2018/8/6.
 * Description:
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior   = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println(" i m a model Duck...");
    }
}
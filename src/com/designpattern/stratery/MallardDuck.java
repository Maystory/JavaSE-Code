package com.designpattern.stratery;

/**
 * Created by Maven on 2018/8/6.
 * Description:
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        /**
         * 从外面传入而不是构造的时候实例化
         */
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println(" Im a real mallardDuck ...");
    }

}
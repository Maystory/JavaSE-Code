package com.designpattern.stratery;

/**
 * Created by Maven on 2018/8/6.
 * Description:
 */
public class FlyNoWay  implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" i can not fly ");
    }
}
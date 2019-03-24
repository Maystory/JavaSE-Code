package com.designpattern.Wrapper;

/**
 * @author mf
 * @since 2019-03-14 23:15
 * 摩卡 2元
 */
public class Moka extends CondimentDirectoer {
    private Beverage beverage;

    public Moka(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return "moka";
    }

    @Override
    double cost() {
        return 2 + beverage.cost();
    }
}
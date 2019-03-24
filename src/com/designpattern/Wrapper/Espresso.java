package com.designpattern.Wrapper;

/**
 * @author mf
 * @since 2019-03-14 23:12
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "espresso";
    }

    @Override
    double cost() {
        return 1.8;
    }
}
package com.designpattern.Observer;

/**
 * Created by Maven on 2018/8/7.
 * Description:
 */
public class CurrentConditionDisplay implements Observer, DisplyElement {
    private float temprature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("current conditions is temprature:" + temprature + ",humidity:" + humidity);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temprature = temp;
        this.humidity = humidity;
        display();
    }
}
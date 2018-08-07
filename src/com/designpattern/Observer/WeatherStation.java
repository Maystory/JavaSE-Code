package com.designpattern.Observer;

/**
 * Created by Maven on 2018/8/7.
 * Description:
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(11L,22L,33L);
        currentConditionDisplay.display();
    }
}
package com.designpattern.Observer;

/**
 * Created by Maven on 2018/8/7.
 * Description:
 * 观察者模式 定义了对象之间的一对多依赖，当一个对象状态发生变化的时候，所有的依赖着都会受到通知并做相应的处理
 * 改变主题或者观察者其中一方，不影响另一方。
 *
 * 设计原则：为了交互对象之间松耦合而努力
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(11L,22L,33L);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        currentConditionDisplay.display();
    }
}
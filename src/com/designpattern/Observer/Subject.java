package com.designpattern.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeOberserver(Observer observer);
    void notifyObservers();
}

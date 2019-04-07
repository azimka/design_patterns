package com.azimka.behavioral.observer.observable;

import com.azimka.behavioral.observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class ForecastStation implements IObservable {

    private List<IObserver> observers = new ArrayList<>();
    private double currentTemperature;

    @Override
    public void addObserver(IObserver observable) {
        observers.add(observable);
    }

    @Override
    public void removeObservable(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }

    public double getTemperature(){
        return currentTemperature;
    }

    public void changeState(double currentTemperature){
        this.currentTemperature = currentTemperature;
        System.out.println("Some logic here");
        notifyObservers();
    }
}

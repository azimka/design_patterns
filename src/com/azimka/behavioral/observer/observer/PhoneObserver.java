package com.azimka.behavioral.observer.observer;

import com.azimka.behavioral.observer.observable.ForecastStation;

public class PhoneObserver implements IObserver{

    private ForecastStation forecastStation;

    public PhoneObserver(ForecastStation forecastStation) {
        this.forecastStation = forecastStation;
    }

    @Override
    public void update() {
        System.out.println(String.format("new temperature is %s", forecastStation.getTemperature()));
    }
}

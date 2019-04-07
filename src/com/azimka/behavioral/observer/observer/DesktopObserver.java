package com.azimka.behavioral.observer.observer;

import com.azimka.behavioral.observer.observable.ForecastStation;

public class DesktopObserver implements IObserver {

    private ForecastStation forecastStation;

    public DesktopObserver(ForecastStation forecastStation) {
        this.forecastStation = forecastStation;
    }

    @Override
    public void update() {
        System.out.println(String.format("show new temperature on desktop: %s", forecastStation.getTemperature()));
    }
}

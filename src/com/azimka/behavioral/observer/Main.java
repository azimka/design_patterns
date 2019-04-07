package com.azimka.behavioral.observer;

import com.azimka.behavioral.observer.observable.ForecastStation;
import com.azimka.behavioral.observer.observer.DesktopObserver;
import com.azimka.behavioral.observer.observer.IObserver;
import com.azimka.behavioral.observer.observer.PhoneObserver;

public class Main {

    public static void main(String[] args) {
        ForecastStation forecastStation = new ForecastStation();

        IObserver phoneObserver = new PhoneObserver(forecastStation);
        IObserver anotherPhoneObserver = new PhoneObserver(forecastStation);
        IObserver desktopObserver = new DesktopObserver(forecastStation);

        forecastStation.addObserver(phoneObserver);
        forecastStation.addObserver(anotherPhoneObserver);
        forecastStation.addObserver(desktopObserver);

        forecastStation.changeState(33);
    }
}

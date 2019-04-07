package com.azimka.behavioral.observer.observable;

import com.azimka.behavioral.observer.observer.IObserver;

public interface IObservable {
    void addObserver(IObserver observable);

    void removeObservable(IObserver observer);

    void notifyObservers();
}

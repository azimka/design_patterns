package com.azimka.behavioral.strategy;

import com.azimka.behavioral.strategy.navigator.Navigator;
import com.azimka.behavioral.strategy.navigator.Point;
import com.azimka.behavioral.strategy.strategies.BikeStrategy;

public class Main {

    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        navigator.setMoveStrategy(new BikeStrategy());
        navigator.createPath(new Point(55.4d, 55.3d), new Point(66.5d, 76.5));

    }
}

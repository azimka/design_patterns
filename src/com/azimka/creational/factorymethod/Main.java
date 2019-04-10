package com.azimka.creational.factorymethod;

import com.azimka.creational.factorymethod.creator.AirTransportCreator;
import com.azimka.creational.factorymethod.creator.TransportCreator;

public class Main {
    public static void main(String[] args) {
        TransportCreator transportCreator = new AirTransportCreator();

        transportCreator.doSomeLogic();
    }
}

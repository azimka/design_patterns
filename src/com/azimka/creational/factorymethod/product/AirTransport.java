package com.azimka.creational.factorymethod.product;

public class AirTransport implements Transport{
    @Override
    public void deliver() {
        System.out.println("delivered by air;");
    }
}

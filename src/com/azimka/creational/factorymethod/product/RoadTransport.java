package com.azimka.creational.factorymethod.product;

public class RoadTransport implements Transport{
    @Override
    public void deliver() {
        System.out.println("delivered by road;");
    }
}

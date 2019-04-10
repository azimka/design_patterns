package com.azimka.creational.factorymethod.product;

public class SeaTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("delivered by sea;");
    }
}

package com.azimka.behavioral.strategy.strategies;

public class BikeStrategy implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("find path with bike");
    }
}

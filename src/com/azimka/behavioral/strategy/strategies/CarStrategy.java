package com.azimka.behavioral.strategy.strategies;

public class CarStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("find path moving with car");
    }
}

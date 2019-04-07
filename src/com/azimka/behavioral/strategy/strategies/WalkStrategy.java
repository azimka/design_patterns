package com.azimka.behavioral.strategy.strategies;

public class WalkStrategy  implements MoveStrategy{

    @Override
    public void move() {
        System.out.println("find path walking from a to b");
    }
}

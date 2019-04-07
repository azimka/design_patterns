package com.azimka.behavioral.strategy.navigator;

import com.azimka.behavioral.strategy.strategies.MoveStrategy;

public class Navigator {

    private MoveStrategy moveStrategy;

    public void createPath(Point fromPoint, Point toPoint) {
        System.out.println(String.format("Navigator creating path from %s , to %s", fromPoint, toPoint ));
        moveStrategy.move();
    }


    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }
}

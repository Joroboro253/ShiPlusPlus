package com.shpp.vetal;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot {
    public void run() throws Exception {
        turnLeft();
        moveUntilTheWall();
        checkBeeper();

        turnAround();
        moveUntilTheWall();
        turnLeft();
        toNextColumn();

        turnLeft();
        moveUntilTheWall();
        turnAround();

        moveUntilTheWall();
        turnLeft();
        toNextColumn();

        turnLeft();
        moveUntilTheWall();
        turnAround();
        moveUntilTheWall();
        turnLeft();
        toNextColumn();
        turnLeft();
        moveUntilTheWall();

        turnAround();
        moveUntilTheWall();
    }

    private void turnAround() throws Exception {
        for (int i = 0; i < 2; i++) {
            turnLeft();
        }
    }


    private void toNextColumn() throws Exception {
        for (int i = 0; i < 4; i++) {
            move();
        }
    }


    private void moveUntilTheWall() throws Exception {
        while (!frontIsBlocked()){
            checkBeeper();
            move();
        }

    }

    private void checkBeeper() throws Exception {
        if (!beepersPresent()){
            putBeeper();
        }
    }

}

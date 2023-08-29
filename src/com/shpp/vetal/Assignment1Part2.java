package com.shpp.vetal;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot {
    public void run() throws Exception {
        turnLeft();
        moveUntilTheWall();
        turnRight();
        toNextColumn();

        turnRight();
        moveUntilTheWall();
        turnLeft();

        toNextColumn();
        turnLeft();
        moveUntilTheWall();

        turnRight();
        toNextColumn();
        turnRight();
        moveUntilTheWall();

    }

    private void toNextColumn() throws Exception {

        for (int i = 0; i < 4; i++) {
            move();
        }
    }


    private void moveUntilTheWall() throws Exception {
        while (frontIsClear()){
            checkBeeper();
            move();
        }
    }

    private void checkBeeper() throws Exception {
        if (!beepersPresent()){
            putBeeper();
        }
    }

    private void turnRight() throws Exception {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }

}

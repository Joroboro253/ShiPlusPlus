package com.shpp.vetal;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part1 extends KarelTheRobot {
    public void run() throws Exception {
        goToNewspaper();
        takeNewspaper();
        backToStart();
    }

    private void goToNewspaper() throws Exception {
        moveUntilTheWall();
        turnRight();
        move();
        turnLeft();
        move();
        move();
    }
    private void takeNewspaper() throws Exception {
        pickBeeper();
    }
    private void backToStart() throws Exception {
        turnLeft();
        turnLeft();
        moveUntilTheWall();
        turnRight();
        move();
    }

    public void moveUntilTheWall() throws Exception {
        while (frontIsClear()){
            move();
        }
    }
    private void turnRight() throws Exception {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }


}

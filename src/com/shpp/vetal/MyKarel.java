package com.shpp.vetal;

import com.shpp.karel.KarelTheRobot;

public class MyKarel  extends KarelTheRobot {
    public void run() throws Exception {
      turnLeft();
      moveUntilWall();

    }

    private void stepToTheLeft() throws Exception{
        turnLeft();
        move();
        turnRight();
    }

    private void turnRight() throws Exception {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }

    private void moveUntilWall() throws Exception {
        while (frontIsClear()){
            move();
        }
    }
}

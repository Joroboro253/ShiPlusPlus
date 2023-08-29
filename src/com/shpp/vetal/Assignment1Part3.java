package com.shpp.vetal;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part3 extends KarelTheRobot {
    int amountOfLines = 0;
    public void run() throws Exception {
        amountOfLines = countingLines();
        turnAround();
        goToMidpoint(findMidpoint(amountOfLines));
        putBeeper();
    }

//    private void turnRight() throws Exception {
//        for (int i = 0; i < 3; i++) {
//            turnLeft();
//        }
//    }

    private int countingLines() throws Exception {
        int lines = 0;
        while (!frontIsBlocked()) {
            lines++;
            move();
        }
        return lines;
    }

    private int findMidpoint(int amountOfLines){
        return amountOfLines / 2;
    }

    private void goToMidpoint(int midpoint) throws Exception {
        for (int i = 0; i < midpoint; i++) {
            move();
        }
    }

    private void turnAround() throws Exception {
        for (int i = 0; i < 2; i++) {
            turnLeft();
        }
    }
}

package com.ragequit.game;

public class LevelManager {

    private static final int TOTAL_LEVELS = 10;
    private int currentLevel = 1;

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getTotalLevels() {
        return TOTAL_LEVELS;
    }

    public void nextLevel() {
        if (currentLevel < TOTAL_LEVELS) {
            currentLevel++;
        }
    }
}

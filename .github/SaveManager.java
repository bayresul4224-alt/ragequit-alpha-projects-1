package com.ragequit.game;

public class SaveManager {

    private int highestUnlockedLevel = 1;

    public int getHighestUnlockedLevel() {
        return highestUnlockedLevel;
    }

    public void unlockLevel(int level) {
        if (level > highestUnlockedLevel) {
            highestUnlockedLevel = level;
        }
    }
}

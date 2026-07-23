package com.ragequit.game;

public class GameState {

    public static final int PLAYING = 0;
    public static final int DEAD = 1;
    public static final int LEVEL_COMPLETE = 2;

    private int currentState = PLAYING;

    public int getCurrentState() {
        return currentState;
    }

    public void setCurrentState(int state) {
        currentState = state;
    }

    public boolean isPlaying() {
        return currentState == PLAYING;
    }
}

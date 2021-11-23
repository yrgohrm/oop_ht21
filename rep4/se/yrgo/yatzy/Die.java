package se.yrgo.yatzy;

import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private int lastRolledValue = 1;
    private boolean isHeld = false;

    public int roll() {
        if (isHeld) {
            return lastRolledValue;
        }

        lastRolledValue = ThreadLocalRandom.current().nextInt(6) + 1;
        return lastRolledValue;
    }

    public void hold(boolean shouldBeHeld) {
        isHeld = shouldBeHeld;
    }

    public boolean isHeld() {
        return isHeld;
    }

    public int getLastRolledValue() {
        return lastRolledValue;
    }

    @Override
    public String toString() {
        return Integer.toString(lastRolledValue);
    }
}

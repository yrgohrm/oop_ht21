package se.yrgo.yatzy;

import java.util.ArrayList;
import java.util.List;

public class DiceCup {
    private List<Die> dice;
    private int rollCount = 0;

    public DiceCup(int count) {
        dice = new ArrayList<>();
        for (int i = 0; i < count; ++i) {
            dice.add(new Die());
        }
    }

    public void roll() {
        rollCount++;

        if (rollCount > 3) {
            throw new IllegalStateException("Can't roll again");
        }

        for (Die die : dice) {
            die.roll();
        }
    }

    public void newTurn() {
        rollCount = 0;
        for (Die die : dice) {
            die.hold(false);
        }
    }

    @Override
    public String toString() {
        return "DiceCup [dice=" + dice + "]";
    }

    public void hold(int index) {
        if (index < 0 || index >= dice.size()) {
            throw new IllegalArgumentException("No such dice: " + index);
        }
        
        dice.get(index).hold(true);
    }

    public List<Die> getDice() {
        return List.copyOf(dice);
    }
}

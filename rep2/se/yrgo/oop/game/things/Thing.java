package se.yrgo.oop.game.things;

import se.yrgo.oop.game.Player;

public interface Thing {
    String getDescription();
    void use(Player player);
}

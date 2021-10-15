package se.yrgo.oop.game.things;

import se.yrgo.oop.game.Player;

public class Flower implements Thing {
    private String color;

    public Flower(String color) {
        this.color = color;
    }

    @Override
    public String getDescription() {
        return String.format("en fin %s blomma", color);
    }

    @Override
    public void use(Player player) {
        System.out.println("Den luktar lite giftigt och sticker i näsan!");
        player.decreaseHealth(10);
    }
}

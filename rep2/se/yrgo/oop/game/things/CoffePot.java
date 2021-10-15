package se.yrgo.oop.game.things;

import se.yrgo.oop.game.Player;

public class CoffePot implements Thing {
    private String owner;

    public CoffePot(String owner) {
        this.owner = owner;
    }

    @Override
    public String getDescription() {
        return owner + " fina kaffepanna";
    }

    @Override
    public void use(Player player) {
        System.out.println("Kaffet smakar utmärkt! Du känner dig hälsosam och pigg!");
        player.increaseHealth(2);
    }
    
}

package se.yrgo.oop.game.things;

import se.yrgo.oop.game.Player;

public class BoringThing implements Thing {
    private String description;

    public BoringThing(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void use(Player player) {
        System.out.println("Inget händer med " + description);
    }
}

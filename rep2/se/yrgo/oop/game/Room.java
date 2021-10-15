package se.yrgo.oop.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import se.yrgo.oop.game.things.Thing;

public class Room {
    private String description;
    private List<Room> connectedRooms;
    private List<Thing> things;

    public Room(String description) {
        this.description = description;
        this.connectedRooms = new ArrayList<>();
        this.things = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public void addConnectedRoom(Room room) {
        if (!connectedRooms.contains(room)) {
            connectedRooms.add(room);
            room.addConnectedRoom(this);
        }
    }

    public List<Room> getConnectedRooms() {
        return Collections.unmodifiableList(connectedRooms);
    }

    public void addThing(Thing thing) {
        things.add(thing);
    }

    public List<Thing> getThings() {
        return Collections.unmodifiableList(things);
    }
}

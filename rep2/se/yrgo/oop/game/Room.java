package se.yrgo.oop.game;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String description;
    private List<Room> connectedRooms;

    public Room(String description) {
        this.description = description;
        this.connectedRooms = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public void addConnectedRoom(Room room) {
        connectedRooms.add(room);
    }

    public List<Room> getConnectedRooms() {
        return connectedRooms;
    }
}

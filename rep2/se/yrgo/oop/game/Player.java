package se.yrgo.oop.game;

public class Player {
    private String name;
    private int health;
    private Room currentRoom;

    public Player(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}

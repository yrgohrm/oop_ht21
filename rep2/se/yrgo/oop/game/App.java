package se.yrgo.oop.game;

import java.util.Scanner;

/*

Spelare (liv, namn)
Olika rum (beskrivning, monster, saker och leda till andra rum)
Saker (namn)
Monster (namn, skada, liv)

*/

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välkommen till Spelet!");
        System.out.println("Vad heter du?");
        String name = scanner.nextLine();

        Player player = new Player(name);

        System.out.printf("Välkommen %s! Hoppas du överlever.%n", player.getName());


        Room room1 = new Room("Farmors hemtrevliga kök");
        Room room2 = new Room("Farmors otrevliga källare");

        room1.addConnectedRoom(room2);
        room2.addConnectedRoom(room1);

        player.setCurrentRoom(room1);

        Room currentRoom = player.getCurrentRoom();
        System.out.printf("Du är nu i %s.%n", currentRoom.getDescription());
        System.out.println("Du kan gå till:");
        int count = 1;
        for (Room room : currentRoom.getConnectedRooms()) {
            System.out.printf("\t%d. %s%n", count, room.getDescription());
            count++;
        }
    }
}

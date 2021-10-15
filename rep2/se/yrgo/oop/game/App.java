package se.yrgo.oop.game;

import java.util.Scanner;

import se.yrgo.oop.game.things.BoringThing;
import se.yrgo.oop.game.things.CoffePot;
import se.yrgo.oop.game.things.Flower;
import se.yrgo.oop.game.things.Thing;

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

        Room startRoom = createMap();
        player.setCurrentRoom(startRoom);

        while (true) {
            printRoomInfo(player);

            if (!doAction(scanner, player)) {
                break;
            }

            player.decreaseHealth(1);
            if (player.getHealth() == 0) {
                System.out.println("Du är nu tyvärr död...");
                break;
            }
        }
    }

    private static Room createMap() {
        Room room1 = new Room("Farmors hemtrevliga kök");

        Thing coffePot1 = new CoffePot("Farmors");
        Thing coffePot2 = new CoffePot("Farfars");
        room1.addThing(coffePot1);
        room1.addThing(coffePot2);

        Room room2 = new Room("Farmors otrevliga källare");

        Thing devilStatue = new BoringThing("Hemsk staty av en djävul");
        room2.addThing(devilStatue);

        Room room3 = new Room("Den fina trädgården");

        Thing flower1 = new Flower("röd");
        Thing flower2 = new Flower("vit");

        room3.addThing(flower1);
        room3.addThing(flower2);

        room1.addConnectedRoom(room2);
        room1.addConnectedRoom(room3);

        return room1;
    }

    private static boolean doAction(Scanner scanner, Player player) {
        System.out.println("Vad vill du göra?");
        String action = scanner.nextLine();

        if (action.startsWith("byt till")) {
            goToRoom(action, player);
            System.out.println();
        }
        else if (action.startsWith("bruka")) {
            useThing(action, player);
            System.out.println();
        }
        else if (action.equals("sluta")) {
            return false;
        }

        return true;
    }

    private static void printRoomInfo(Player player) {
        Room currentRoom = player.getCurrentRoom();
        System.out.printf("Du är nu i %s.%n", currentRoom.getDescription());

        System.out.printf("Din hälsa är på nivå %d.%n", player.getHealth());

        if (currentRoom.getThings().isEmpty()) {
            System.out.println("Här är det tomt på prylar.");
        } else {
            System.out.println("Här kan du se:");
            int count = 1;
            for (Thing thing : currentRoom.getThings()) {
                System.out.printf("\t%d. %s%n", count, thing.getDescription());
                count++;
            }
        }

        System.out.println("Du kan gå till:");
        int count = 1;
        for (Room room : currentRoom.getConnectedRooms()) {
            System.out.printf("\t%d. %s%n", count, room.getDescription());
            count++;
        }
    }

    private static void goToRoom(String action, Player player) {
        Room currentRoom = player.getCurrentRoom();
        String choice = action.substring(9);
        int roomIndex = Integer.parseInt(choice) - 1;
        Room goTo = currentRoom.getConnectedRooms().get(roomIndex);
        player.setCurrentRoom(goTo);
    }

    private static void useThing(String action, Player player) {
        Room currentRoom = player.getCurrentRoom();
        String choice = action.substring(6);
        int thingIndex = Integer.parseInt(choice) - 1;
        Thing thing = currentRoom.getThings().get(thingIndex);
        thing.use(player);
    }
}

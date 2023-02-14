package org.example.io;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
* Example class copied from Collections
* section.
* */
public class GameExample {

    private static Locations locations = new Locations();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available: ");

            for (String exit : exits.keySet()) {
                System.out.print(exit + " ");
            }
            System.out.println();

            // exercise code

            Map<String, String> aliases = Stream.of(new String[][] {
                    {"NORTH", "N"},
                    {"SOUTH", "S"},
                    {"WEST", "W"},
                    {"EAST", "E"},
                    {"QUIT", "Q"}
            }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

            String[] cmd = scanner.nextLine().split(" ");
            String direction = null;
            if (cmd.length == 1) {
                direction = cmd[0];
            } else {
                for (String kw : cmd) {
                    direction = aliases.get(kw.toUpperCase());
                }
            }
            if (direction != null && exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    protected void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
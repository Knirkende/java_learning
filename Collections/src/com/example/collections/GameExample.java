package com.example.collections;

import java.util.*;
public class GameExample {
    public static void main(String[] args) {
        Map<Integer, Location> locations = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String[] descriptions = {"zeroeth", "first", "second", "third", "fourth", "fifth"};

        for (int i = 0; i < descriptions.length; i++) {
            locations.put(i, new Location(i, descriptions[i]));
        }

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
        locations.get(5).addExit("Q", 0);
        /*
        for (Integer loc : locations.keySet()) {
            System.out.println(loc + " : " + locations.get(loc).getDescription());
        }
        */

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

            Map<String, String> aliases = new HashMap<>();

            aliases.put("NORTH", "N");
            aliases.put("SOUTH", "S");
            aliases.put("WEST", "W");
            aliases.put("EAST", "E");
            aliases.put("QUIT", "Q");
            aliases.put("N", "N");
            aliases.put("S", "S");
            aliases.put("W", "W");
            aliases.put("E", "E");
            aliases.put("Q", "Q");

            String[] cmd = scanner.nextLine().split(" ");
            String direction = null;
            for (String kw : cmd) {
                direction = aliases.get(kw.toUpperCase());
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

    public void addExit(String direction, int location) {
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

package com.example.collections;

import java.util.*;

public class MapExamples {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "Compiled");
        languages.put("Python", "Interpreted");
        languages.put("BASIC", "Old-timey");
        languages.put("Algol", "Algorithmic");
        languages.put("Lisp", "Madness");

        System.out.println(languages.get("Java"));
        languages.put("Java", "Replaced");

        System.out.println(languages.get("Java"));

        // put returns null if the key was not present in map
        if (languages.put("Lisp", "Replaced") != null) {
            System.out.println("Was replaced.");
        }

        if (languages.containsKey("Java")) {
            System.out.println("Map contains the key.");
        }

        //languages.remove("Lisp");
        // can specify key/value pair with remove method
        if (languages.remove("Algol", "A family of languages")) {
            System.out.println("Removed");
        } else {
            System.out.println("Not removed");
        }

        // replace matching key only
        languages.replace("Lisp", "Imperative-ish");
        languages.replace("Scala", "This will not be added; null will be returned");

        // replace matching key and value
        languages.replace("Lisp", "Imperative-ish", "New value");

        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }

    }

}

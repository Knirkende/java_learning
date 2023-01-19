package com.example.accessModifier;

public class SomeClass {

    private static int classCounter = 0;
    private final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}

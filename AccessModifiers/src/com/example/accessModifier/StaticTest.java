package com.example.accessModifier;

public class StaticTest {
    private static int numInstances = 0;
    private final String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}

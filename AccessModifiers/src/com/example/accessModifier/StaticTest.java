package com.example.accessModifier;

public record StaticTest(String name) {
    private static int numInstances = 0;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }
}

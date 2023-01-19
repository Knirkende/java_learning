package com.example.accessModifier;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Example";
        System.out.println("Static init block called.");
    }

    public SIBTest() {
        System.out.println("Constructor called.");
    }

    static {
        System.out.println("2nd init block called");
    }

    public void someMethod() {
        System.out.println("someMethod called.");
    }
}

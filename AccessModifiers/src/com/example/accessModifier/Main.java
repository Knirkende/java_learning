package com.example.accessModifier;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("First");
        System.out.println(firstInstance.name());
        System.out.println(StaticTest.getNumInstances());
        StaticTest secondInstance = new StaticTest("Second");
        System.out.println(secondInstance.name());
        System.out.println(StaticTest.getNumInstances());

        int answer = multiply(2);
        System.out.println("Answer: " + answer);

        SomeClass sc1 = new SomeClass("First");
        SomeClass sc2 = new SomeClass("Second");

        System.out.println(sc1.getInstanceNumber());
        System.out.println(sc2.getInstanceNumber());

        SIBTest s = new SIBTest();
    }

    public static int multiply(int n) {
        return n*multiplier;
    }
}

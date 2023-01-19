package com.example.accessModifier;

public class Main {
    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("First");
        System.out.println(firstInstance.getName());
        System.out.println(firstInstance.getNumInstances());
        StaticTest secondInstance = new StaticTest("Second");
        System.out.println(secondInstance.getName());
        System.out.println(secondInstance.getNumInstances());
    }
}

package com.example.collections;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Place", 8, 12);
        //theatre.getSeats();

        if (theatre.reserveSeat("H11")) {
            System.out.println("Okay");
        } else {
            System.out.println("No");
        }
        if (theatre.reserveSeat("H11")) {
            System.out.println("Okay");
        } else {
            System.out.println("No");
        }

    }
}

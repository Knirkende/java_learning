package com.example.collections;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Place", 8, 12);
        //theatre.getSeats();

        if (theatre.reserveSeat("H11")) {
            System.out.println("Okay");
        } else {
            System.out.println("No");
        }
        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        // comparator

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13));
        priceSeats.add(theatre.new Seat("A00", 13));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

        /*
        if (theatre.reserveSeat("H11")) {
            System.out.println("Okay");
        } else {
            System.out.println("No");
        }

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats); //shallow copy
        printList(seatCopy);
        // demonstrates shallow copy
        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Done, works.");
        } else {
            System.out.println("Already reserved, not done.");
        }
        Collections.shuffle(seatCopy);
        System.out.println("seatCopy:");
        printList(seatCopy);
        System.out.println("theatre.seats:");
        printList(theatre.seats);
        // min and max
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);

        sortList(seatCopy);
        System.out.println();
        System.out.println("Bubblesorted seatCopy:");
        printList(seatCopy);
*/
    }
    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("-----");
    }
/*
    // bubble sort
    public static void sortList(List<? extends Theatre.Seat> list) {
        int n = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for(int j = i+1; j < list.size(); j++) {
                n++;
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
        System.out.println();
        System.out.println("Bubblesort n = " + n);
    }
    */

}

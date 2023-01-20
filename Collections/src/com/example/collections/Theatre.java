package com.example.collections;

import java.util.*;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();


    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat o1, Seat o2) {
                return o1.getPrice() - o2.getPrice();
            }
        };
    }

    public String getTheatreName() {
        return theatreName;
    }

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                int price = 12;

                if((row < 'D') && (seatNum >=4 && seatNum <= 9)) {
                    price = 14;
                } else if((row > 'F') || (seatNum < 4 || seatNum > 9)) {
                    price = 7;
                }
                Seat seat =  new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("No seat");
            return false;
        }

/*        for (Seat seat : seats) {
            System.out.print(".");
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("No such seat.");
            return false;
        }
        return requestedSeat.reserve();*/
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;
        private int price;

        public Seat(String seatNumber, int price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat o) {
            System.out.print(".");
            return this.seatNumber.compareToIgnoreCase(o.getSeatNumber());
        }

        public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat reserved: " + seatNumber);
                return true;
            }
            return false;
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Cancelled: " + seatNumber);
                return true;
            }
            return false;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public int getPrice() {
            return price;
        }
    }


}

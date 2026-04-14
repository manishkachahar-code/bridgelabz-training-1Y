package com.gla.Collection;
import java.util.*;


class Booking {
    String userId;
    String eventName;
    boolean isVIP;

    public Booking(String userId, String eventName, boolean isVIP) {
        this.userId = userId;
        this.eventName = eventName;
        this.isVIP = isVIP;
    }

    @Override
    public String toString() {
        return userId + " booked " + eventName + (isVIP ? " [VIP]" : "");
    }
}

public class TicketReservation {
    public static void main(String[] args) {


        Set<String> users = new HashSet<>();

        users.add("U101");
        users.add("U102");
        users.add("U103");
        users.add("U101"); // duplicate ignored

        System.out.println("Registered Users: " + users);


        Queue<Booking> normalQueue = new LinkedList<>();

        // VIP PriorityQueue (VIP first)
        PriorityQueue<Booking> vipQueue = new PriorityQueue<>(
                (a, b) -> Boolean.compare(b.isVIP, a.isVIP)
        );


        normalQueue.add(new Booking("U101", "Concert", false));
        normalQueue.add(new Booking("U102", "Concert", false));

        vipQueue.add(new Booking("U103", "Concert", true));
        vipQueue.add(new Booking("U102", "Concert", true));

        List<Booking> confirmedBookings = new ArrayList<>();

        System.out.println("\nProcessing VIP Bookings First:");


        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.poll();
            System.out.println("Confirmed: " + b);
            confirmedBookings.add(b);
        }

        System.out.println("\nProcessing Normal Bookings:");


        while (!normalQueue.isEmpty()) {
            Booking b = normalQueue.poll();
            System.out.println("Confirmed: " + b);
            confirmedBookings.add(b);
        }


        System.out.println("\nAll Confirmed Bookings:");
        for (Booking b : confirmedBookings) {
            System.out.println(b);
        }
    }
}

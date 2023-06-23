package models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter = 100;
    private final int no;

    {
        no = ++counter;
    }

    private final ArrayList<Reservation> reservations = new ArrayList<>();

    public int getNo() {
        return no;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d, зарезервирован #%s", no, reservations);
    }
}
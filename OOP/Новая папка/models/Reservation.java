package models;

import java.util.Date;

public class Reservation {
    private Date date;
    private String name;

    private static int counter = 9000;
    private final int id;

    {
        id = ++counter;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

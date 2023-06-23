package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import presenters.Model;

public class TableModel implements Model { ///
    private ArrayList<Table> tables; ///

    public ArrayList<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                tables.add(new Table());
            }
        }
        return tables;
    }

    ///
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    ///
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {

        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                ArrayList<Reservation> tableReservList = table.getReservations();
                for (Reservation tableReserv : tableReservList) {
                    if (tableReserv.getId() == oldReservation) {
                        int index = tableReservList.indexOf(tableReserv);
                        tableReservList.remove(index);
                        break;
                    }
                }
                Reservation reservation = new Reservation(reservationDate, name);
                tableReservList.add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    @Override
    public int resrevationTable(Date reserationDate, int tableNo, String name) {

        throw new UnsupportedOperationException("Unimplemented method 'resrevationTable'");
    }

}

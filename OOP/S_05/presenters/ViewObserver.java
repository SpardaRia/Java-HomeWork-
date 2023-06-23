package presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderDate, int tableNo, String name);

    void changeReservationTable(int pastReservation, Date reservationDate, int tableNo, String name);
}

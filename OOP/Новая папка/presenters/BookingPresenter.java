package presenters;

import models.Table;
import views.BookingView;

import java.util.Collection;
import java.util.Date;

import java.util.ArrayList;
import javax.swing.text.View;

public class BookingPresenter implements ViewObserver {

    private final BookingView bookingView;
    private final Model tableModel;

    public BookingPresenter(BookingView bookingView2, Model tableModel) {
        this.bookingView = bookingView2;
        this.tableModel = tableModel;
        bookingView2.setObserver(this);
    }

    private Collection<Table> loadTables() {
        return tableModel.loadTables();
    }

    public void showTables() {
        bookingView.updateTablesView(loadTables());
    }

    private void showReservationTableResult(int reservationNo) {
        bookingView.updateReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.resrevationTable(orderDate, tableNo, name);
        showReservationTableResult(reservationNo);
    }

    ///
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int newReservationNo = tableModel.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        showChangeReservationTableResalt(newReservationNo);
    }

    private void showChangeReservationTableResalt(int newReservationNo) {
    }
}

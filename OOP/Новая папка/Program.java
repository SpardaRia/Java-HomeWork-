import models.TableModel;
import presenters.BookingPresenter;
import views.BookingView;

import java.util.Date;

public class Program {
    /**
     * @param args
     */
    public static void main(String[] args) {
        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTable(new Date(), 103, "MyName");
        bookingPresenter.showTables();
        bookingView.changeReservationTable(879, new Date(), 8, "MyName");
        bookingPresenter.showTables();
    }

}
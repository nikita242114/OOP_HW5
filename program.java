import java.util.Date;

import models.TableModel;
import presenters.BookingPresenter;
import presenters.Model;
import presenters.View;
import views.BookingView;

public class program {

    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2, "Никита Хлебников");

        view.changeReservationTable(1001, new Date(), 3, "Никита Хлебников");

    }
}

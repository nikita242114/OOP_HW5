import java.util.ArrayList;
import java.util.Collection;

/**
 * Класc описывает модель столик
 */
public class Table {

    public int getNumber() {
        return number;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    private final Collection<Reservation> reservations = new ArrayList<>();
    private static int counter;
    private final int number;
    {
        number = ++counter;
    }

    @Override
    public String toString() {
        return String.format("Столик № %d", number);
    }

}
import java.util.Date;

/**
 * Модель процесса резервирование столика
 */
public class Reservation {
    private static int counter = 1000;
    private final int id;
    private Table table;
    private Date date;
    private String nameClients;
    {
        id = ++counter;
    }

    public Reservation(Table table, Date date, String nameClients) {
        this.table = table;
        this.date = date;
        this.nameClients = nameClients;
    }

    public int getId() {
        return id;
    }

    public void setTable(Table table) {
        this.table = table;
    }

}
package Model.People;

import java.time.LocalDate;
import java.util.Map;

public class Client extends Person{
    private int id;
    private double discount;
    //private Map<int, ShoppingCart> shoppingCartQualify;
    private boolean isLongTermConsumer;
    private LocalDate registeredDate;
    private Long phoneNumber;

    public Client(String name, String surname, LocalDate birthDate, Long PESEL) {
        super(name, surname, birthDate, PESEL);
    }

    public Client(String name, String surname, LocalDate birthDate, Long PESEL, int id,
                  double discount, boolean isLongTermConsumer, LocalDate registeredDate, Long phoneNumber) {
        super(name, surname, birthDate, PESEL);
        this.id = id;
        this.discount = discount;
        this.isLongTermConsumer = isLongTermConsumer;
        this.registeredDate = registeredDate;
        this.phoneNumber = phoneNumber;
    }
}

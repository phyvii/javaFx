package Model;

import java.time.LocalDate;

public abstract class Worker extends Person {


    public Worker(String name, String surname, LocalDate birthDate, Long PESEL) {
        super(name, surname, birthDate, PESEL);
    }
}

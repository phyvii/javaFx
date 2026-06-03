package Model.People;

import Model.Extent.ObjectPlus;

import java.time.LocalDate;

public abstract class Person extends ObjectPlus {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Long PESEL;

    public Person(String name, String surname, LocalDate birthDate, Long PESEL) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.PESEL = PESEL;
    }
}

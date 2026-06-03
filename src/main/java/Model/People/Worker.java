package Model.People;

import java.time.LocalDate;

public abstract class Worker extends Person {
    private int id;
    //private Owner owner;
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
    private String schedule;
    private double standardPay;
    private int behaviorGrad; //{1 to 10}
    private double payAfterBonuses;
    private String login;
    private String password;


    public Worker(String name, String surname, LocalDate birthDate, Long PESEL) {
        super(name, surname, birthDate, PESEL);
    }

    public Worker(String name, String surname, LocalDate birthDate, Long PESEL, int id, LocalDate contractStartDate,
                  LocalDate contractEndDate, String schedule, double standardPay, int behaviorGrad, double payAfterBonuses,
                  String login, String password) {
        super(name, surname, birthDate, PESEL);
        this.id = id;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.schedule = schedule;
        this.standardPay = standardPay;
        this.behaviorGrad = behaviorGrad;
        this.payAfterBonuses = payAfterBonuses;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(LocalDate contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(LocalDate contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public double getStandardPay() {
        return standardPay;
    }

    public void setStandardPay(double standardPay) {
        this.standardPay = standardPay;
    }

    public int getBehaviorGrad() {
        return behaviorGrad;
    }

    public void setBehaviorGrad(int behaviorGrad) {
        this.behaviorGrad = behaviorGrad;
    }

    public double getPayAfterBonuses() {
        return payAfterBonuses;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

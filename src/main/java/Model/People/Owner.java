package Model.People;

import java.time.LocalDate;
import java.util.List;

public class Owner extends Person{
    private Long NIP;
    private List<Worker> workers;
    private double profit;
    private static double taxesPercentageSum;
    private double totalCost;
    private String login;
    private String password;

    public Owner(String name, String surname, LocalDate birthDate, Long PESEL) {
        super(name, surname, birthDate, PESEL);
    }

    public Owner(String name, String surname, LocalDate birthDate, Long PESEL, Long NIP, List<Worker> workers, double profit, double totalCost, String login, String password) {
        super(name, surname, birthDate, PESEL);
        this.NIP = NIP;
        this.workers = workers;
        this.profit = profit;
        this.totalCost = totalCost;
        this.login = login;
        this.password = password;
    }

    public Long getNIP() {
        return NIP;
    }

    public void setNIP(Long NIP) {
        this.NIP = NIP;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public static double getTaxesPercentageSum() {
        return taxesPercentageSum;
    }

    public static void setTaxesPercentageSum(double taxesPercentageSum) {
        Owner.taxesPercentageSum = taxesPercentageSum;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
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

    @Override
    public String toString() {
        return "Owner{" +
                "NIP=" + NIP +
                ", workers=" + workers +
                ", profit=" + profit +
                ", totalCost=" + totalCost +
                '}';
    }
}

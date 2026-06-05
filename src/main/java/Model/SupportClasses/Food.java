package Model.SupportClasses;

import java.time.LocalDate;

public class Food extends Product{
    private boolean isNearExpirationDate;
    private double discount;
    private boolean stillFreshFlag;

    public boolean isNearExpirationDate() {
        return isNearExpirationDate;
    }

    public void setNearExpirationDate(boolean nearExpirationDate) {
        isNearExpirationDate = nearExpirationDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isStillFreshFlag() {
        return stillFreshFlag;
    }

    public void setStillFreshFlag(boolean stillFreshFlag) {
        this.stillFreshFlag = stillFreshFlag;
    }

    public Food(int id, String name, String company, LocalDate productionDate,
                LocalDate expirationDate, double price, int spaceTaken, boolean isNearExpirationDate, double discount, boolean stillFreshFlag) {
        super(id, name, company, productionDate, expirationDate, price, spaceTaken);
        this.isNearExpirationDate = isNearExpirationDate;
        this.discount = discount;
        this.stillFreshFlag = stillFreshFlag;
    }



}

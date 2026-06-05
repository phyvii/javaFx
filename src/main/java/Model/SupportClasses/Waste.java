package Model.SupportClasses;

import java.time.LocalDate;

public class Waste extends Product{
    private boolean canBeUtilized;
    private boolean recyclable;
    public Waste(Product preProduct, boolean canBeUtilized, boolean recyclable) {
        //super(id, name, company, productionDate, expirationDate, price, spaceTaken);
        super(preProduct.getId(), preProduct.getName(), preProduct.getCompany(),
                preProduct.getProductionDate(),preProduct.getExpirationDate(), preProduct.getPrice(), preProduct.getSpaceTaken());
        this.canBeUtilized = canBeUtilized;
        this.recyclable = recyclable;
    }

    public boolean isCanBeUtilized() {
        return canBeUtilized;
    }

    public void setCanBeUtilized(boolean canBeUtilized) {
        this.canBeUtilized = canBeUtilized;
    }

    public boolean isRecyclable() {
        return recyclable;
    }

    public void setRecyclable(boolean recyclable) {
        this.recyclable = recyclable;
    }
}

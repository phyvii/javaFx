package Model.SupportClasses;

import Model.Extent.ObjectPlus;

import java.time.LocalDate;

public class ProductMagazine extends ObjectPlus {
    private LocalDate arrivalDate;
    private int count;
    private int totalSpaceTaken;
    private Magazine magazine;
    private Product product;

    public ProductMagazine(LocalDate arrivalDate, int count, Magazine magazine, Product product) {
        this.arrivalDate = arrivalDate;
        this.count = count;
        this.magazine = magazine;
        this.product = product;

        product.addProductMagazineRelation(this);
        magazine.addProductMagazineRelation(this);

    }

    public void remove(){
        if(this.magazine != null){
            this.magazine.removeProductMagazineRelation(this);
            this.magazine = null;
        }

        if(this.product!=null){
            this.product.removeProductMagazineRelation(this);
            this.product = null;
        }
        this.removeFromExtent();
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalSpaceTaken() {
        return totalSpaceTaken;
    }

    public void setTotalSpaceTaken(int totalSpaceTaken) {
        this.totalSpaceTaken = totalSpaceTaken;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

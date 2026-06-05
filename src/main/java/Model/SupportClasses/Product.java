package Model.SupportClasses;

import Model.Extent.ObjectPlus;

import java.time.LocalDate;
import java.util.List;

public abstract class Product extends ObjectPlus {
    private int id;
    private String name;
    private String company;
    private LocalDate productionDate;
    private LocalDate expirationDate;
    private double price;
    private int spaceTaken;
    private List<ProductMagazine> productMagazines;


    public Product(int id, String name, String company, LocalDate productionDate, LocalDate expirationDate, double price, int spaceTaken) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        this.price = price;
        this.spaceTaken = spaceTaken;
    }

    protected void addProductMagazineRelation(ProductMagazine pm){
        if(!productMagazines.contains(pm)){
            productMagazines.add(pm);
        }
    }
    protected void removeProductMagazineRelation(ProductMagazine pm){
        if(productMagazines.contains(pm)){
            productMagazines.remove(pm);
        }
    }

    public List<ProductMagazine> getProductMagazines(){
        return java.util.Collections.unmodifiableList(productMagazines);
    }

    public void listProductMagazineRelation(){
        for(ProductMagazine pm: productMagazines){
            System.out.println(pm.toString());
        }
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpaceTaken() {
        return spaceTaken;
    }

    public void setSpaceTaken(int spaceTaken) {
        this.spaceTaken = spaceTaken;
    }


}

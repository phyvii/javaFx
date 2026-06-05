package Model.SupportClasses;

import Model.Extent.ObjectPlus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Magazine extends ObjectPlus {
    private int totalSpace;
    private int usedSpace;
    private LocalDate date;
    private List<ProductMagazine> productMagazines;

    public Magazine(int totalSpace, LocalDate date) {
        this.totalSpace = totalSpace;
        this.date = date;
        productMagazines = new ArrayList<>();
    }

    protected void addProductMagazineRelation(ProductMagazine pm){
        if(!productMagazines.contains(pm)){
            if(totalSpace-usedSpace>=pm.getTotalSpaceTaken()){
                productMagazines.add(pm);
                usedSpace+=pm.getTotalSpaceTaken();
            }else
                throw new RuntimeException("Not enough space");
        }
    }
    protected void removeProductMagazineRelation(ProductMagazine pm){
        if(productMagazines.contains(pm)){
            productMagazines.remove(pm);
            usedSpace-=pm.getTotalSpaceTaken();
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

    public int getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(int totalSpace) {
        this.totalSpace = totalSpace;
    }

    public int getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(int usedSpace) {
        this.usedSpace = usedSpace;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setProductMagazines(List<ProductMagazine> productMagazines) {
        this.productMagazines = productMagazines;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "totalSpace=" + totalSpace +
                ", usedSpace=" + usedSpace +
                ", date=" + date +
                '}';
    }
}

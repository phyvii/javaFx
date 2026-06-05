package Model.SupportClasses;

import Model.Extent.ObjectPlus;

import java.time.LocalDate;
import java.util.List;

public class Magazine extends ObjectPlus {
    private int totalSpace;
    private int usedSpace;
    private LocalDate date;
    private List<ProductMagazine> productMagazines;

    public Magazine(int totalSpace, int usedSpace, LocalDate date) {
        this.totalSpace = totalSpace;
        this.usedSpace = usedSpace;
        this.date = date;
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


}

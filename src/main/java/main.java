import Model.SupportClasses.*;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Product food1 = new Food(1,"food","nestle",
                LocalDate.now(),LocalDate.of(2027,6,1),
                13.99,10,false,0.00,
                true
                );

        Product waste = new Waste(food1,false,false);

        Magazine magazine = new Magazine(1000,LocalDate.now());

        ProductMagazine productMagazine = new ProductMagazine(LocalDate.now(),110,magazine,waste);

        System.out.println(magazine.getUsedSpace());
        System.out.println(productMagazine.getTotalSpaceTaken());


    }
}

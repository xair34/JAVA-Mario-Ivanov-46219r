package restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert{
    private double CAKE_GRAMS = 250;
    private double CAKE_CALORIES = 1000;
    private BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);
    public Cake(String name, BigDecimal price, double g, double cal) {
        super(name, price, g, cal);
        super.setGrams(CAKE_GRAMS);
        super.setCals(CAKE_CALORIES);
        super.setPrice(CAKE_PRICE);
    }
}

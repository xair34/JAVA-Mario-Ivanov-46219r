package restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish{
    private double SALMON_GRAMS = 22;
    public Salmon(String name, BigDecimal price, double g, double cal) {
        super(name, price, g, cal);
        g = SALMON_GRAMS;
    }
}

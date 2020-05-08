package restaurant;

import java.math.BigDecimal;

public class Beverage extends Product{
    private double Mililiters;

    public double getMililiters() {
        return Mililiters;
    }

    public Beverage(String name, BigDecimal price, double mil) {
        super(name, price);
        this.Mililiters = mil;
    }
}

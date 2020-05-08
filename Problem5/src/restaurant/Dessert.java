package restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{
    private double Calories;

    public double getCalories() {
        return Calories;
    }

    public Dessert(String name, BigDecimal price, double g, double cal) {
        super(name, price, g);
        this.Calories = cal;
    }

    protected void setCals(double cals) {
        Calories = cals;
    }
}

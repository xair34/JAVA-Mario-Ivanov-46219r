package restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    private double COFFEE_MILILITERS = 50;
    private BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.5);
    private double Caffeine;

    public double getCaffeine() {
        return Caffeine;
    }

    public Coffee(String name, BigDecimal price, double mil, double caf) {
        super(name, price, mil);
        this.Caffeine = caf;
    }
}

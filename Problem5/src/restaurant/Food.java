package restaurant;

import java.math.BigDecimal;

public class Food extends Product{
    private double Grams;

    public double getGrams(){
        return  this.Grams;
    }
    public Food(String name, BigDecimal price, double g) {
        super(name, price);
        this.Grams = g;
    }

    protected void setGrams(double g) {
        Grams = g;
    }
}

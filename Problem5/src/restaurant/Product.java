package restaurant;

import java.math.BigDecimal;

public class Product {
    private String Name;
    private BigDecimal Price;

    public String getName(){
        return this.Name;
    }
    public BigDecimal getPrice(){
        return this.Price;
    }
    public Product(String name, BigDecimal price){
        this.Name = name;
        this.Price = price;
    }

    protected void setPrice(BigDecimal p) {
        Price = p;
    }
}

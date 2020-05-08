package CarShop;

import java.io.Serializable;

public class Seat implements Car, Serializable {
    private String Model;
    private String Color;
    private Integer HorsePower;
    @Override
    public String getModel() {
        return Model;
    }

    @Override
    public String getColor() {
        return Color;
    }

    @Override
    public Integer getHorsePower() {
        return HorsePower;
    }

    public Seat(String model, String color, Integer hp){
        this.Model = model;
        this.Color = color;
        this.HorsePower = hp;
    }
    public String toString(){
        String k = "Model: "+this.Model + "\nColor: "+this.Color + "\nHorse Power: " + this.HorsePower;
        return k;
    }
}

package need4Speed;

public class Car extends Vehicle{
    public Car(double fuel, int hp) {
        super(fuel, hp);
        super.setFuelConsumption(3);
    }
}

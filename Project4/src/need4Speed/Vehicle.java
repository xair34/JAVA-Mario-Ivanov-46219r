package need4Speed;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double FuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    private double Fuel;
    private int HorsePower;

    public double getFuelConsumption() {
        return this.FuelConsumption;
    }
    public double getFuel(){
        return  this.Fuel;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public Vehicle(double fuel, int hp){
        this.Fuel = fuel;
        this.HorsePower = hp;
    }
    public void Drive(double kilometers){
        double totalDriven = kilometers * FuelConsumption;
        double left = Fuel - totalDriven;
        if(totalDriven > Fuel){
            System.out.println("No!\nFuel needed" + " " + totalDriven + "\nYou have: "+ Fuel);
        }else{
            System.out.println("Yes!\nFuel Left: " +" "+ left);
        }
    }

    protected void setFuelConsumption(int i) {
        FuelConsumption = i;
    }
}

package Ferrari;

public class Ferrarri implements Car {
    private String driverName;
    private String model;

    public Ferrarri(String driverName) {
        this.driverName = driverName;
        this.model = "488-Spider";
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", this.model, brakes(), gas(), this.driverName);

    }
}
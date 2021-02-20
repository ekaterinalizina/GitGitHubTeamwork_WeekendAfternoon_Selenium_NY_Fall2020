package cars;

public class Bmw {

    public static
    // Create 4 variables
    // 2 or 3 Constructors
    // 2 or 3 Methods

    String brand = "BMW";
    int cost = 70000;
    String engine = "V6";
    String modelName = "M6";

    public Bmw(int cost) {
        this.cost = cost;
    }

    public Bmw(int cost, String engine) {
        this.cost = cost;
        this.engine = engine;
    }

    public Bmw(int cost, String engine, String modelName) {
        this.cost = cost;
        this.engine = engine;
        this.modelName = modelName;
    }

    public static String StartCar() {
        String carStarted = "Car has started";
        return carStarted;
    }

    public static String AccelerateCar() {
        String carAccelerates = "Car accelerates";
        return carAccelerates;
    }

    public static String RadioOn() {
        String radioOn = "Car radio turned on";
        return radioOn;
    }

}

public class Truck extends Car {
    double load;

    public Truck(String name, double engineCapacity, double averageBurning, boolean isAirConOn, double load) {
        super(name, engineCapacity, averageBurning, isAirConOn);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return super.toString() + ", załadunek: " + load;
    }

    @Override
    public double countRange() {
        double burning = getAverageBurning();
        double airOonCoefficient = 1.6;
        double loadCoefficient = 0.5;

        if (isAirConOn) {
            burning = getAverageBurning() + airOonCoefficient;
        }

        burning += loadCoefficient * (load / 100);

        return 100 * getEngineCapacity() / burning;
    }
}


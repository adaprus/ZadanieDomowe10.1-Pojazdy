public class Car extends Vehicle {
    boolean isAirConOn;

    public Car(String name, double engineCapacity, double averageBurning, boolean isAirConOn) {
        super(name, engineCapacity, averageBurning);
        this.isAirConOn = isAirConOn;
    }

    public boolean isAirConOn() {
        return isAirConOn;
    }

    public void setAirConOn(boolean airConOn) {
        isAirConOn = airConOn;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", czy klimatyzacja jest włączona: " + isAirConOn;
    }

    @Override
    public double countRange() {
        double burning = getAverageBurning();
        double airOonCoefficient = 0.8;

        if (isAirConOn) {
            burning += getAverageBurning() + airOonCoefficient;
        }

        return 100 * getEngineCapacity() / burning;
    }
}

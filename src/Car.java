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

    public boolean turnOnAirCon() {
        isAirConOn = true;

        return isAirConOn;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", czy klimatyzacja jest włączona: " + isAirConOn;
    }

    public double countRange() {
        double burning = getAverageBurning();

        if (isAirConOn) {
            burning = getAverageBurning() + 0.8;
        }

        return 100 * getEngineCapacity() / burning;
    }


}

public class Truck extends Car{
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

    public double countRange(){
        double burning = getAverageBurning();

        if(isAirConOn) {
            burning = getAverageBurning() + 1.6;
        }

        burning += 0.5 * (load / 100);

        return 100 * getEngineCapacity() / burning;
    }

    @Override
    public boolean isAirConOn() {
        return super.isAirConOn();
    }
}


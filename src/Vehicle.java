public class Vehicle {
    private String name;
    private double engineCapacity;
    private double averageBurning;

    public Vehicle() {
    }

    public Vehicle(String name, double engineCapacity, double averageBurning) {
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.averageBurning = averageBurning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getAverageBurning() {
        return averageBurning;
    }

    public void setAverageBurning(double averageBurning) {
        this.averageBurning = averageBurning;
    }

    @Override
    public String toString() {
        return "nazwa: " + name +
                ", pojemność baku: " + engineCapacity +
                ", średnie spalanie na 100 km: " + averageBurning;
    }
}

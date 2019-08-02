public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Volvo", 240, 8.2, false);
        Car car1 = new Truck("Scania", 400, 22, false, 1000);

        System.out.println(car.toString());
        System.out.println(car1.toString());

        System.out.printf("Zasieg: %.2f km", car.countRange());
        System.out.println();
        System.out.printf("Zasieg: %.2f km", car1.countRange());
        System.out.println();

        car.turnOnAirCon();
        car1.turnOnAirCon();

        System.out.println("Po włączeniu klimatyzacji:");
        System.out.printf("Zasieg: %.2f km", car.countRange());
        System.out.println();
        System.out.printf("Zasieg: %.2f km", car1.countRange());
    }
}

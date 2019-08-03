public class VehicleTest {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Car("Volvo", 240, 8.2, false);
        cars[1] = new Truck("Scania", 400, 22, false, 1000);


        System.out.println(cars[0].toString());
        System.out.println(cars[1].toString());

        System.out.printf("Zasieg: %.2f km", cars[0].countRange());
        System.out.println();
        System.out.printf("Zasieg: %.2f km", cars[1].countRange());
        System.out.println();

        cars[0].setAirConOn(true);
        cars[1].setAirConOn(true);

        System.out.println("Po włączeniu klimatyzacji:");
        System.out.printf("Zasieg: %.2f km", cars[0].countRange());
        System.out.println();
        System.out.printf("Zasieg: %.2f km", cars[1].countRange());
    }
}

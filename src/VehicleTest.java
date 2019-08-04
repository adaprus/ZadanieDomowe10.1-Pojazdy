public class VehicleTest {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Car("Volvo", 240, 8.2, false);
        cars[1] = new Truck("Scania", 400, 22, false, 1000);

        for(int i =0; i < cars.length; i++){
            System.out.println(cars[i].toString());
            System.out.printf("Zasieg: %.2f km", cars[i].countRange());
            System.out.println();
        }

        System.out.println("Po włączeniu klimatyzacji:");

        for (int i =0; i < cars.length; i++) {
            cars[i].setAirConOn(true);
            System.out.printf("Zasieg %s: %.2f km", cars[i].getName(), cars[i].countRange());
            System.out.println();
        }
    }
}

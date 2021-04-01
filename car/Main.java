package car;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Engine carEngine = new Engine();
        Engine truckEngine = new Engine();
        Engine bikeEngine = new Engine();

        Car car = new Car("Honda",50,100,5,carEngine);
        Truck truck = new Truck("GM",100,75,5,truckEngine);
        MotorBike bike = new MotorBike("Suzuki",75,125,5,bikeEngine,2);
        Vehicle[] vehicles = {car,truck,bike};
        System.out.println("Vehicles names & prices: ");
        VehicleApp.printVehicleNamesAndPrices(vehicles);

        ArrayList<DriveAble> driveAbles = new ArrayList<>();
        driveAbles.add(car);driveAbles.add(truck);
        System.out.println("Speed of drivables: ");
        VehicleApp.getSpeedOfDriveableVehicles(driveAbles);

        System.out.println("Car total before tax: "+car.totalBeforeTax());
        System.out.print("Car total after tax: ");
        car.totalAfterTax(car);

        System.out.println("Truck total before tax: "+truck.totalBeforeTax());
        System.out.print("Truck total after tax: ");
        truck.totalAfterTax(truck);

        System.out.println("Driveables sorted by speed: ");
        VehicleApp.sortAndPrintDriveableVehiclesBySpeed(driveAbles);
    }
}

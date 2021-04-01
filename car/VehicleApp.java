package car;

import java.util.ArrayList;
import java.util.Comparator;

public class VehicleApp {

    static void printVehicleNamesAndPrices(Vehicle[] vehicles){
        for(Vehicle v : vehicles){
            System.out.println(v.getName()+ ": "+v.getPrice());
        }
    }

    static void getSpeedOfDriveableVehicles(ArrayList<Vehicle> driveAbles){
        for(Vehicle d : driveAbles){
            System.out.println(d.getSpeed());
        }
    }

    static void sortAndPrintDriveableVehiclesBySpeed(ArrayList<Vehicle> driveAbles){
        driveAbles.sort(Comparator.comparing(Vehicle::getSpeed));
        for(Vehicle d : driveAbles){
            System.out.println(d.getName() + ": " + d.getSpeed());
        }
    }
}

package car;

import java.util.ArrayList;
import java.util.Comparator;

public class VehicleApp {

    static void printVehicleNamesAndPrices(Vehicle[] vehicles){
        for(Vehicle v : vehicles){
            System.out.println(v.getName()+ ": "+v.getPrice());
        }
    }

    static void getSpeedOfDriveableVehicles(ArrayList<DriveAble> driveAbles){
        for(DriveAble d : driveAbles){
            System.out.println(d.milesPerHour());
        }
    }

    static void sortAndPrintDriveableVehiclesBySpeed(ArrayList<DriveAble> driveAbles){
        driveAbles.sort(Comparator.comparing(DriveAble::milesPerHour));
        for(DriveAble d : driveAbles){
            System.out.println(d.milesPerHour());
        }
    }
}

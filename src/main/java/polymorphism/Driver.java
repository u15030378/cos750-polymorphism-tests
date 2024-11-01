package polymorphism;

import polymorphism.vehicles.Vehicle;

import java.util.Objects;

public class Driver {
    boolean hasCarLicense;
    boolean hasTruckLicense;

    public Driver(boolean hasCarLicense, boolean hasTruckLicense) {
        this.hasCarLicense = hasCarLicense;
        this.hasTruckLicense = hasTruckLicense;
    }

    public String driveToCapeTown(Vehicle vehicle) {
        String driveSound = "";
        if (
                (Objects.equals(vehicle.getType(), "Car") || Objects.equals(vehicle.getType(), "Bakkie")) &&
                        this.hasCarLicense || this.hasTruckLicense
        ) {
            driveSound = vehicle.drive();
        } else if (Objects.equals(vehicle.getType(), "Truck") && this.hasTruckLicense) {
            driveSound = vehicle.drive();
        } else {
            driveSound = "Thumbs up, we're hitchhiking.";
        }
        return driveSound;
    }
}

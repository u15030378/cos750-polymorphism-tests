package polymorphism;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import polymorphism.vehicles.Truck;
import polymorphism.vehicles.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PolymorphicVehicleClassTests {

    @Test
    void driveTruckShouldProduceCorrectOutput() {
        // Arrange
        Vehicle vehicle = new Truck();
        Driver truckDriver = new Driver(true, true);

        // Act
        String vehicleSound = truckDriver.driveToCapeTown(vehicle);
        System.out.println(vehicleSound);

        // Assert
        assertEquals("Revving up a big 12l diesel engine... Vroom Vroom!", vehicleSound);
    }


// Uncomment the following tests after you have implemented the classes
/*    @Test
    void driveCarShouldProduceCorrectOutput() {
        // Arrange
        Vehicle vehicle = new Car();
        Driver carDriver = new Driver(true, false);

        // Act
        String output = carDriver.driveToCapeTown(vehicle);
        System.out.println(output);

        // Assert
        assertEquals("Revving up a small 1.6l petrol engine... Vroom Vroom!", output);
    }

    @Test
    void driveBakkieShouldProduceCorrectOutput() {
        // Arrange
        Vehicle vehicle = new Bakkie();
        Driver bakkieDriver = new Driver(true, true);

        // Act
        String output = bakkieDriver.driveToCapeTown(vehicle);
        System.out.println(output);

        // Assert
        assertEquals("Revving up a 3.2l turbo diesel engine... Vroom Vroom!", output);
    }

    @Test
    void driveFormulaOneCar() {
        // Arrange
        Vehicle vehicle = new FormulaOneCar();
        Driver madMan = new Driver(true, false);

        // Act
        String output = madMan.driveToCapeTown(vehicle);
        System.out.println(output);

        // Assert
        assertEquals("Revving up a tuned 2.4l petrol engine... NNNYAAAAUW!", output);
    }*/

}

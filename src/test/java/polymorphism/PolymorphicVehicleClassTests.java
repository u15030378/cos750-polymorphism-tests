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

        // Act
        String output = vehicle.drive();
        System.out.println(output);

        // Assert
        assertEquals("Revving up a big 12l diesel engine... Vroom Vroom!", output);
    }


// Uncomment the following tests after you have implemented the classes
/*    @Test
    void driveCarShouldProduceCorrectOutput() {
        // Arrange
        Vehicle vehicle = new Car();

        // Act
        String output = vehicle.drive();
        System.out.println(output);

        // Assert
        assertEquals("Revving up a small 1.6l petrol engine... Vroom Vroom!", output);
    }

    @Test
    void driveMotorcycleShouldProduceCorrectOutput() {
        // Arrange
        Vehicle vehicle = new Motorcycle();

        // Act
        String output = vehicle.drive();
        System.out.println(output);

        // Assert
        assertEquals("Revving up a small 0.5l petrol engine... Vroom Vroom!", output);
    }

    @Test
    void driveFormulaOneCar() {
        // Arrange
        Vehicle vehicle = new FormulaOneCar();

        // Act
        String output = vehicle.drive();
        System.out.println(output);

        // Assert
        assertEquals("Revving up a tuned 2.4l petrol engine... NNNYAAAAUW!", output);
    }*/

}

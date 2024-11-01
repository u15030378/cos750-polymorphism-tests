package polymorphism.vehicles;

public class Truck extends Vehicle {

    public Truck() {
        super("Truck");
    }

    @Override
    public String drive() {
        if (hasAcceleratorPedal()) {
            return "Revving up a big 12l diesel engine... Vroom Vroom!";
        }
        return "This vehicle cannot drive. It has no accelerator pedal.";
    }
}

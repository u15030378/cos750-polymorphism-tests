package polymorphism.vehicles;

public abstract class Vehicle {
    protected boolean hasAcceleratorPedal;
    protected String type = "We don't know yet";

    public Vehicle(String type) {
        this.type = type;
        this.hasAcceleratorPedal = true;
    }

    protected boolean hasAcceleratorPedal() {
        return this.hasAcceleratorPedal;
    }

    public String getType() {
        return this.type;
    }

    public abstract String drive();
}
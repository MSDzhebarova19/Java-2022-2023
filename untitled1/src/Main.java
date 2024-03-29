

class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private int numWheels;
    public Motorcycle(String make, String model, boolean hasSidecar, int numWheels) {
        super(make, model);
        this.hasSidecar = hasSidecar;
        this.numWheels = numWheels;
    }
    public void leanLeft() {
        System.out.println("Leaning left");
    }
    public void leanRight() {
        System.out.println("Leaning right");
    }
    public String toString() {
        return super.toString() + " Motorcycle [hasSidecar=" + hasSidecar + ", numWheels=" + numWheels + "]";
    }
    public void drive() {
        System.out.println("Driving motorcycle");
    }
    public void stop() {
        System.out.println("Stopping motorcycle");
    }
}
class Truck extends Vehicle {
    private int payloadCapacity;
    private int numAxles;
    public Truck(String make, String model, int payloadCapacity, int numAxles) {
        super(make, model);
        this.payloadCapacity = payloadCapacity;
        this.numAxles = numAxles;
    }
    public void load() {
        System.out.println("Loading truck");
    }
    public void unload() {
        System.out.println("Unloading truck");
    }
    public String toString() {
        return super.toString() + " Truck [payloadCapacity=" + payloadCapacity + ", numAxles=" + numAxles + "]";
    }
    public void drive() {
        System.out.println("Driving truck");
    }
    public void stop() {
        System.out.println("Stopping truck");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 4, "Red");
        Vehicle motorcycle = new Motorcycle("Harley Davidson", "Sportster", false, 2);
        Vehicle truck = new Truck("Ford", "F-150", 1000, 2);
        System.out.println(car.getMakeAndModel());
        car.drive();
        car.stop();
        ((Car) car).lockDoors();
        ((Car) car).unlockDoors();
        System.out.println(motorcycle.getMakeAndModel());
    }
}
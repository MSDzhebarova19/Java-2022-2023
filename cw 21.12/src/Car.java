public class Car implements Vehicle {
    private double fuelQuantity;
    private double consumption;

    private static double AIR_CONDITION_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double consumption){
        this.fuelQuantity = fuelQuantity;
        this.consumption = consumption + AIR_CONDITION_ADDITIONAL_CONSUMPTION;
    }

    @Override
    public void drive(double distance){
        double fuelNeeded = distance * this.consumption;
        if(fuelNeeded> this.fuelQuantity){
            System.out.println("Car needs refueling");
        }
        else{
            fuelQuantity-= fuelNeeded;
            System.out.printf("Car travelled %.1f km%n", distance);
        }
    }


    @Override
    public double getFuelQuantity(){
        return this.fuelQuantity;
    }

    @Override
    public void refuel(double liters){
        fuelQuantity+=liters;

    }

}

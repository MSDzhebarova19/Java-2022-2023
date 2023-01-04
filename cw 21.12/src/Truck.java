public class Truck implements Vehicle{
    private double fuelQuantity;
    private double consumption;

    private static double AIR_CONDITION_ADDITIONAL_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double consumption){
        this.fuelQuantity = fuelQuantity;
        this.consumption = consumption + AIR_CONDITION_ADDITIONAL_CONSUMPTION;
    }

    @Override
    public void drive(double distance){
       double fuelNeeded = distance * this.consumption;
       if(fuelNeeded > this.fuelQuantity){
           System.out.println("Truck needs refueling");
       }
       else{
           fuelQuantity-=fuelNeeded;
           System.out.printf("Truck travelled %.1f km%n", distance);
       }
    }

    @Override
    public void refuel(double liters){
     fuelQuantity +=liters *0.95;
    }

    @Override
    public double getFuelQuantity() {
        return 0;
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String[] firstTokens = firstInput.split("\\s+");
        Vehicle car = new Car(Double.parseDouble(firstTokens[1]),
                Double.parseDouble(firstTokens[2]));


        String secondInput = scanner.nextLine();
        String[] secondTokens = secondInput.split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(secondTokens[1]),
                Double.parseDouble(secondTokens[2]));


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            String command = scanner.nextLine();
            String[] commandTokens = command.split("//s+");

            String[] tokens = scanner.nextLine().split("//s+");
            String action = commandTokens[0];
            String vehicle = commandTokens[1];
            double argument = Double.parseDouble(commandTokens[2]);

            if(action.equals("Drive")){
                if(vehicle.equals("Car")){
                    car.drive(argument);
                }else if(vehicle.equals("Truck")){
                    truck.drive(argument);
                } else {
                    System.out.println("Invalid input");
                }
            }
            else if(action.equals("Refuel")){
                if(vehicle.equals("Car")){
                    car.refuel(argument);
                } else if(vehicle.equals("Truck")){
                    truck.refuel(argument);
                }
                else{
                    System.out.println("Invalid input");
                }

            }
            else{
                System.out.println("Invalid input");
            }


        }
        System.out.printf("Car: %.2f", car.getFuelQuantity());
        System.out.printf("Truck: %.2f", car.getFuelQuantity());
    }
}

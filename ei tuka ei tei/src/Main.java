import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            Animal animal = new Animal();
            String name = scanner.nextLine();
            Integer age = Integer.parseInt(scanner.nextLine());
            String sound = scanner.nextLine();
            animal.makeSound();
        }
        catch(Exception ex){
            throw ex;
        }
        Dog dog = new Dog();
        dog.makeSound();
        dog.bark();


    }
}
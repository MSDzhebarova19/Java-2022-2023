import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int n = Integer.parseInt(scanner.nextLine());
            int p = Integer.parseInt(scanner.nextLine());
            int result = n/p;
            System.out.println(result);
            System.out.println("end");
        }
        catch(NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally...");
        }

        System.out.println("after try-catch");
    }
}
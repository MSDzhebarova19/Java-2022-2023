import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        /*String first = "Mercedes";
        String second = "Opel";
        String third = "Ivan";
        int result = first.compareTo(second);
        System.out.println(result);

        int secondResult = second.compareTo(first);
        System.out.println(secondResult);

        int finalResult = second.compareTo(third);
        System.out.println(finalResult);*/

        /*Integer n = 10;
        Integer m = 20;
        Integer p = 10;

        int result = n.compareTo(m);
        System.out.println(result);

        int secondResult = m.compareTo(n);
        System.out.println(secondResult);

        int finalResult = Integer.compare(result, secondResult);
        System.out.println(finalResult);
        System.out.println(n.compareTo(p));*/

        Car car1 = new Car("Mercedes", "ML" , 15);
        Car car2 = new Car("Opel", "Astra",20);
        Car car3 = new Car("VW", "Golf", 10);
        Car car4 = new Car("VW", "Golf", 12);

        int result = car1.compareTo(car2);

        System.out.println(result);

        System.out.println(car2.compareTo(car3));
        System.out.println(car3.compareTo(car4));
    }
}
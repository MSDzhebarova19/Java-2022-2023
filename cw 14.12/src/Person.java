public class Person extends Mammal implements Animal {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Person is eating...");
    }

    public void walk() {
        System.out.println("Person is walking...");
    }

    public void sleep() {
        System.out.println("Person is sleeping...");
    }
}

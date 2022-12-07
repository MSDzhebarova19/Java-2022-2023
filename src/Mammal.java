public abstract class Mammal implements Animal {
    public void sleep(){
        System.out.println("Cat is eating...");
    }
    public abstract void walk();

    @Override
    public void test(){
        System.out.println("Testing...");
    }
}

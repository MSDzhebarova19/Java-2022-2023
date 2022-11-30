public class Person {
private String name;
private int age;
public Person(String name, int age) {
    this.name = name;
    this.age=age;
}
public String setName(String name)
    if(name.contains("1") || name.contains("2")){
        return;
    }
    this.name=name;
    }
}

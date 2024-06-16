package java_0612;

public class Person {
    String name;
    int age;
    final String gender = "female";
    static final int NUMBER = 1;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
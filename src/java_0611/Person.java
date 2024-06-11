package java_0611;

public class Person {
    String name;
    int phoneNumber;
    int money;
    int age;
    public Person(String name, int phoneNumber, int money, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.money = money;
        this.age = age;
    }
    public void sayHello() {
        System.out.println("Hello, " + name);
    }
    public void sayMoney() {
        System.out.println(money);
    }
    public void teaching(Student student) {
        student.levelUp();
    }
    public void cheating(Student student) {
        student.levelDown();
    }
}
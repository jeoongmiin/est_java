package java_0611;

public class problem3 {
    public static void main(String[] args) {
        Person person1 = new Person("a", 12345678, 50000, 20);
        Person person2 = new Person("b", 23456789, 60000, 30);
        person1.sayHello();
        person1.sayMoney();
        person2.sayHello();
        person2.sayMoney();

        Student student = new Student(1);
        person1.teaching(student);
        person2.cheating(student);
    }
}
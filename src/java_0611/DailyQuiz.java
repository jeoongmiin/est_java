package java_0611;
/* 실습 : 여러분 자신을 추상화 해봅시다. 그리고 상호작용 하고 싶은 대상을 만들어보고
   서로 상호 작용 할 수 있는 메소드를 만들어 봅시다. */

class Me {
    private String name;
    private String number;
    public Me(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public void feeding(Cat cat) {
        cat.ageUp();
    }
}

class Cat {
    private String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void ageUp() {
        age++;
        System.out.println("age: " + age);
    }
}

public class DailyQuiz {
    public static void main(String[] args) {
        Me me = new Me("jungmin", "7");
        Cat cat = new Cat("yaong", 1);
        me.feeding(cat);
    }
}
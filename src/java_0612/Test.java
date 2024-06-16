package java_0612;

public class Test {

    public static void main(String[] args) {

        SeongJo seongJo12 = new SeongJo(100, 5000);
        Food food = new Food(50, 30, "사탕");

        seongJo12.buyFood(food); // 4950

        System.out.println(seongJo12.money);
        seongJo12.eatFood(food); // 130
        seongJo12.eatFood(food); // 160
        System.out.println(seongJo12.weight); // 160
        System.out.println(seongJo12.fat); // true
    }
}
package java_0613;
/* 문제
1. 부모 (parent) 클래스를 구현하고 money 멤버변수 를 가지고 있고 저축한다 라는 메서드를 가지고있는데 해당 메서드는  money 를 10000원씩 추가하는 로직을 갖고있다
2. 자식(child) 클래스를 구현하고 부모 클래스를 상속 받아 투자한다라는 메서드를 가지고 있는데 해당 메서드는 money를 1000원을 뺴는 로직을 갖고있다. */

public class problem1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.money = 0;
        child.saveMoney();
        child.saveMoney();
        child.saveMoney();
        System.out.println(child.money);
        child.investMoney();
        System.out.println(child.money);
    }
}
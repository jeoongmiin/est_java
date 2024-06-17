package java_0617;
/* 1. KiaCar 라는 구현체클래스를 만든다
   2. 이 구현체는 Car 라는 인터페이스를 구현한다.
   3. Car 인터페이스는 Tier, Engine, Navi 라는 각 인터페이스를 상속받는다.
   4. Tier에는 타이어 이름을 반환하는 getTier 라는 메서드가 있다.
   5. Engine에는 엔진 이름을 반환하는 showEngine 메서드 가있다.
   6. Navi 에는 내비의 가격을 반환하는 amountNavi 라는 메서드가 있다.
   7. 최종적으로 메인메서드에서 KiaCar라는 구현체를 만들어서 각 메서드를 호출한다. */

public class Problem1 {
    public static void main(String[] args) {
        Car kiaCar = new KiaCar();
        kiaCar.getTier();
        kiaCar.ShowEngine();
        kiaCar.amountNavi();
    }
}
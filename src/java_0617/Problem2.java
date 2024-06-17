package java_0617;
/* Car 클래스를 만드는데 제네릭 형식으로 만든다.
그리고 main에서 String 타입을 가진 인스턴스를 생성하고 get,set 메서드를 호출한다 */

public class Problem2 {
    public static void main(String[] args) {
        CarG<String> car = new CarG<>();

        car.setCarG("BMW");
        System.out.println(car.getCarG());
    }
}
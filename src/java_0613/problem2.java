package java_0613;
/* 계산기 클래스에 say라는 반환값이 없는 함수를 만드는데, 이 함수는 단순히 문자열을 출력한다
컴퓨터 클래스에 say라는 함수를 오버라이딩 하여 새로운 문자열을 출력한다. */

public class problem2 {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원면적" + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원면적" + computer.areaCircle(r));
    }
}
package java_0603;
/* 변수 a에 10, b에 20, c에 30이 저장되어 있습니다. 세 변수 중 가장 큰 값을 출력하는 코드를 작성하세요 */

public class ifQuiz4 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, max;
        if (a > b && a > c) {
            System.out.println("a");
        } else if (a < b && a > c) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }
}
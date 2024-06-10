package java_0604;
/* 문제:
구구단 19단을 역방향으로 출력하는 프로그램을 작성하세요.
출력 형식은 "19 x 19 = 361"부터 "19 x 1 = 19"까지 역순으로 출력되어야 합니다. */

public class forProblem5 {
    public static void main(String[] args) {
        for (int i = 19; i >= 1; i--) {
                System.out.println("19 x " + i + " = " + 19 * i);
        }
    }
}
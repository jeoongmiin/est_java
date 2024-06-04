/* 문제: 구구단 2단 출력하기
목표: 반복문을 사용하여 구구단 2단을 출력하는 프로그램을 작성하세요.
조건:
1. 반복문을 사용하여 1부터 9까지 2와 곱하는 작업을 반복합니다.
2. 구구단은 한 줄에 하나씩 출력되며, 각 줄에는 "<단> × <곱할 숫자> = <결과>" 형식으로 출력합니다. */

public class forProblem4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}
package java_0604;
/* 문제: 짝수의 합 계산하기
목표: 1부터 100까지의 숫자 중에서 모든 짝수의 합을 계산하고 출력하는 프로그램을 작성하세요.
조건:
1. for 문을 사용하여 1부터 100까지 숫자를 반복합니다.
2. 각 숫자가 짝수인지 판별합니다 (짝수는 2로 나누어 떨어지는 숫자입니다).
3. 짝수인 경우, 그 값을 누적하여 합계를 계산합니다.
4. 모든 반복이 끝나면 짝수의 총합을 출력합니다. */

public class forProblem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
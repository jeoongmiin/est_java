package java_0614;
/* 사용자로부터 두 개의 정수를 입력받아 나눗셈을 수행하는 프로그램을 작성하세요.
이때, 두 번째 정수가 0인 경우 ArithmeticException을 처리하여 적절한 메시지를 출력하세요. */

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = a / b;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            sc.close();
        }
    }
}
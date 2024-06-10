package java_0603;
/* 변수 operator에 '+', '-', '*', '/' 중 하나의 문자가 저장되어 있습니다.
두 개의 정수형 변수 num1과 num2의 값에 따라 해당 연산을 수행하고 결과를 출력하는 코드를 작성하세요. */

public class switchQuiz2 {
    public static void main(String[] args) {
        char operator = '/';
        int num1 = 3, num2 = 1;
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }
    }
}
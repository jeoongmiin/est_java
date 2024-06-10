package java_0603;
/* 변수 year에 2023이 저장되어 있습니다. year가 윤년인지 아닌지를 판별하는 코드를 작성하 세요.
• 윤년의 조건: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수인 해 */

public class ifQuiz3 {
    public static void main(String[] args) {
        int year = 2023;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
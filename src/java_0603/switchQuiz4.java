package java_0603;
/* 변수 `score`에 0부터 100 사이의 점수가 저장되어 있습니다. 점수 범위에 따라 "A", "B", "C", "D", "F" 등급을 출력하는 코드를 작성하세요.
    - 90 이상: A
    - 80 이상 90 미만: B
    - 70 이상 80 미만: C
    - 60 이상 70 미만: D
    - 60 미만: F */

public class switchQuiz4 {
    public static void main(String[] args) {
        int score = 95;
        switch (score / 10) {
            case 10:
                System.out.println('A');
                break;
                case 9:
                System.out.println('A');
                break;
            case 8:
                System.out.println('B');
                break;
            case 7:
                System.out.println('C');
                break;
            case 6:
                System.out.println('D');
                break;
            default:
                System.out.println('F');

        }
    }
}
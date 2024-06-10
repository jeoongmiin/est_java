package java_0603;
/* 변수 score에 75가 저장되어 있습니다. score에 따라 학점을 출력하는 코드를 작성하세요.
• 90점 이상: A
• 80점 이상 90점 미만: B
• 70점 이상 80점 미만:C
• 60점 이상 70점 미만: D
• 60점 미만: F */

public class ifQuiz2 {
    public static void main(String[] args) {
        int score = 75;
        if (score >= 90) {
            System.out.println('A');
        } else if (score >= 80) {
            System.out.println('B');
        } else if (score >= 70) {
            System.out.println('C');
        } else if (score >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
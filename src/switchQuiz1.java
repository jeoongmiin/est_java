/* 변수 grade에 'A', 'B', 'C', 'D', 'F' 중 하나의 문자가 저장되어 있습니다.
각 등급에 따라 "Excellent", "Good", "Average", "Below Average", "Fail"을 출력하는 코드를 작성하세요. */

public class switchQuiz1 {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
        }
    }
}
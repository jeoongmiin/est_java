package java_0603;
/* 문제: 요일에 따른 활동 제안하기!
목표: 프로그램 내에서 미리 지정된 요일에 따라 적합한 활동을 제안하는 프로그램 을 작성하세요.
조건:
1. 요일은 프로그램 내에서 문자열 변수로 미리 정의합니다 (예:"수요일").
2.switch 문을 사용하여 각 요일에 따른 활동을 제안합니다.
• 예: 월요일에는 책 읽기""금요일에는 "영화 보기" 등
3. 일치하는 요일이 없으면 알 수 없는 요일 이라는 메시지를 출력합니다. */

public class switchProblem {
    public static void main(String[] args) {
        String s = "수요일";
        switch (s) {
            case "월요일":
                System.out.println("book");
                break;
            case "화요일":
                System.out.println("movie");
                break;
            case "수요일":
                System.out.println("study");
                break;
                case "목요일":
                System.out.println("play");
                break;
            case "금요일":
                System.out.println("game");
                break;
            case "토요일":
                System.out.println("sleep");
                break;
            case "일요일":
                System.out.println("exercise");
                break;
            default:
                System.out.println("알 수 없는 요일");
        }
    }
}
/* 변수 language에 "Java", "Python", "C++", "JavaScript" 중 하나의 문자열이 저장되어 있습니다.
각 프로그래밍 언어에 대한 간단한 설명을 출력하는 코드를 작성하세요. */

public class switchQuiz5 {
    public static void main(String[] args) {
        String language = "Java";
        switch (language) {
            case "Java":
                System.out.println("Java programming language");
                break;
            case "Python":
                System.out.println("Python programming language");
                break;
            case "C++":
                System.out.println("C++ programming language");
                break;
            case "JavaScript":
                System.out.println("JavaScript programming language");
                break;
        }
    }
}
package java_0603;
/* 변수 color에 "red", "green", "blue" 중 하나의 문자열이 저장되어 있습니다.
각 색상에 따라 "Apple", "Grass", "Sky"를 출력하는 코드를 작성하세요. */

public class switchQuiz3 {
    public static void main(String[] args) {
        String color = "red";
        switch (color) {
            case "red":
                System.out.println("Apple");
                break;
            case "green":
                System.out.println("Grass");
                break;
            case "blue":
                System.out.println("Sky");
                break;
        }
    }
}
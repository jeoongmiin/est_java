package java_0604;
/* 퀴즈 2: 문자열 배열 names가 주어졌을 때, 향상된 반복문을 사용하여 이름의 길이가 5 이상인 이름만 출력하는 코드를 작성하세요. */

public class forProblem9 {
    public static void main(String[] args) {
        String[] arr = {"okay2","asbds","good2","ormiiiii","abcde"};
        for (String s : arr) {
            if (s.length() >= 5) {
                System.out.println(s);
            }
        }
    }
}
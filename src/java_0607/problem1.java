package java_0607;
/* 주어진 문자열의 길이가 홀수인 경우, 문자열의 가운데 3글자를 반환하는 함수를 작성하세요.
예를 들어, 문자열 "Monitor"의 경우 "nit"을 반환해야 합니다.
만약 문자열의 길이가 3보다 작으면, 문자열 자체를 반환하세요.

예제
입력: "Monitor"
출력: "nit"

요구사항
문자열의 길이가 홀수인 경우, 가운데 3글자를 반환합니다.
문자열의 길이가 3보다 작으면, 문자열을 그대로 반환합니다. */

public class problem1 {
    public static void main(String[] args) {
        System.out.println(getMiddleThree());
    }
    static String getMiddleThree() {
        String str = "strings", res = "";
        if (str.length() >= 3) {
            int midIdx = str.length() / 2;
            res = str.substring(midIdx - 1, midIdx + 2);
        }
        return res;
    }
}
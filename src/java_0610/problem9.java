package java_0610;
/* 주어진 문자열에서 모든 별표(*)와 별표 바로 왼쪽 및 오른쪽에 있는 문자를 제거한 버전을 반환하세요.
   예를 들어, "abcd"는 "ad"를 반환하고, "ab**cd"도 "ad"를 반환합니다. */

public class problem9 {
    public static void main(String[] args) {
        System.out.println(starSideDel("cd*zq")); // "cq"
        System.out.println(starSideDel("ab**cd")); // "ad"
        System.out.println(starSideDel("wacy*xko")); // "wacko"
    }
    static String starSideDel(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                i++;
                continue;
            }
            if ((i == 0 || str.charAt(i - 1) != '*' ) && (i == str.length() - 1 || str.charAt(i + 1) != '*')) {
                res += String.valueOf(str.charAt(i));
            }
        }
        return res;
    }
}
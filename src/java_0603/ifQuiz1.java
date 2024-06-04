/* 변수 x에 10이 저장되어 있습니다. x가 양수인지, 음수인지, 아니면 0인지를 판별하는 코드를 작성하세요. (삼항 연산자) */

public class ifQuiz1 {
    public static void main(String[] args) {
        int x = 10;
        String str = (x > 0) ? "양수" : (x < 0) ? "음수" : "0";
        System.out.println(str);
    }
}
/* 변수 passScore에 60이 저장되어 있습니다. 변수 myScore에 75가 저장되어 있을 때,
myscore가 passScore 이상인지 판별하여 합격/불합격을 출력하는 코드를 작성하세요 */

public class ifQuiz5 {
    public static void main(String[] args) {
        int passScore = 60, myScore = 75;
        if (myScore >= passScore) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
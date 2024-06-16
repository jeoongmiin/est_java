package java_0614;
/* Exception 을 상속받아 커스텀 익셉션을 만들되, 에러 메세지를 아무 문자열이나 넣어서 구현해주세요. */

public class DailyQuiz {
    public static void main(String[] args) {
        try {
            ThrowException();
        } catch (DailyQuizException e) {
            System.out.println(e.getMessage());
        }
    }
    static void ThrowException() throws DailyQuizException {
        System.out.println("Error");
    }
}
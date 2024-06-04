/* (하) 1부터 주어진 양의 정수 n까지의 합을 계산하여 출력하는 코드를 while문을 사용하여 작성하세요.
    주어진 값: n = 100 */

public class whileQuiz1 {
    public static void main(String[] args) {
        int n = 100, sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);
    }
}
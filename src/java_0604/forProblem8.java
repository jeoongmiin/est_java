/* 퀴즈 1: 정수형 배열 scores가 주어졌을 때, 향상된 반복문을 사용하여 점수의 총합과 평균을 계산하는 코드를 작성하세요. */

public class forProblem8 {
    public static void main(String[] args) {
        int[] scores = {1,30,20,80,15,20,30,22};
        int sum = 0;
        for (int i : scores) {
            sum += i;
        }
        System.out.println(sum + " " + sum / scores.length);
    }
}
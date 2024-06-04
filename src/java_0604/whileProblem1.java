/* 문제 1: 주어진 배열에서 가장 큰 값을 찾아 출력하는 프로그램을 작성하세요. */

public class whileProblem1 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
        int i = 0, max = 0;
        while (i < numbers.length) {
            max = (numbers[i] > max) ? numbers[i] : max;
            i++;
        }
        System.out.println(max);
    }
}
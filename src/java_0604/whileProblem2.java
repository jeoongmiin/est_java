/* 문제 2:
주어진 배열에서 양수의 합과 음수의 합을 각각 구하여 출력하는 프로그램을 작성하세요. */

public class whileProblem2 {
    public static void main(String[] args) {
        int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
        int psum = 0, nsum = 0, i = 0;
        while (i < numbers.length) {
            if (numbers[i] > 0) psum += numbers[i];
            else nsum += numbers[i];
            i++;
        }
        System.out.println(psum + " " + nsum);
    }
}
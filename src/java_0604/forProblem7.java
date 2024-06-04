/* 목표: 1부터 10까지 숫자를 출력하세요. 이때 4와 7은 건너뛰고 출력합니다. */

public class forProblem7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4 || i == 7) continue;
            System.out.println(i);
        }
        int i = 0;
        while (true) {
            i++;
            if (i == 4 || i == 7) continue;
            System.out.println(i);
            if (i == 10) break;
        }
    }
}
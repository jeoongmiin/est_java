/* 이중포문을 만든다. i -> 1~100, j -> 2-> 100
   i가 50이되면 break, j는 80되면  break; */

public class forProblem6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 50) break;
            for (int j = 2; j <= 100; j++) {
                if (j == 80) break;
                System.out.println(i + " " + j);
            }
        }
    }
}
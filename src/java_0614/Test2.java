package java_0614;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            int result = i / 0;
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            scanner.close();
        }
    }
}
package java_0614;
/* 사용자로부터 정수 배열의 크기와 배열 요소를 입력받아 배열을 생성하는 프로그램을 작성하세요.
이때, 입력된 인덱스가 배열의 크기를 벗어나면 ArrayIndexOutOfBoundsException을 처리하여
적절한 메시지를 출력하세요. */

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("배열의 크기는?");
            int arraySize = sc.nextInt();
            int[] arr = new int[arraySize];
            System.out.println("배열 요소 입력");
            for (int i = 0; i < arraySize; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 배열의 크기를 벗어남");
        } finally {
            sc.close();
        }
    }
}
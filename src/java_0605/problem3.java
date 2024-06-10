package java_0605;
/* 문제: "숫자 맞추기 게임"

사용자가 1부터 100 사이의 숫자를 맞추는 게임을 만들어 보세요. 프로그램은 먼저 1부터 100 사이의 무작위 숫자를 생성합니다.
그런 다음 사용자에게 숫자를 입력하라고 요청합니다. 사용자가 숫자를 입력하면, 프로그램은 사용자가 입력한 숫자가 무작위로 생성된
숫자보다 높은지, 낮은지, 아니면 정확히 맞는지를 알려줍니다. 사용자가 정확한 숫자를 맞출 때까지 이 과정을 반복합니다.
숫자를 맞추면 "정답입니다!"라고 출력하고 게임을 종료합니다. */

import java.util.Random;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int targetNumber = random.nextInt(100) + 1; // 1부터 100 사이의 랜덤 숫자 생성
        System.out.println("숫자를 입력하세요");
        while (true) {
            int guessNumber = scanner.nextInt();
            if (guessNumber < targetNumber) System.out.println("up");
            else if (guessNumber > targetNumber) System.out.println("down");
            else {
                System.out.println("correct");
                break;
            }
        }
    }
}
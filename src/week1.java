import java.util.Scanner;

public class week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("원하는 기능을 선택하세요\n1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
            int num = sc.nextInt();
            int firstNum, secondNum;
            switch (num) {
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    break;
                case 1:
                    System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                    firstNum = sc.nextInt();
                    System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                    secondNum = sc.nextInt();
                    System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                    break;
                case 2:
                    System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                    firstNum = sc.nextInt();
                    System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                    secondNum = sc.nextInt();
                    System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                    break;
                case 3:
                    System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                    firstNum = sc.nextInt();
                    System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                    secondNum = sc.nextInt();
                    System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                    break;
                case 4:
                    System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                    firstNum = sc.nextInt();
                    System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                    secondNum = sc.nextInt();
                    System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                    break;
                default:
                    System.out.println("올바른 입력이 아닙니다.");
            }
        }
    }
}
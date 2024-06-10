/* 문제: "영화 티켓 예매 시스템"

영화관에서 사용할 수 있는 간단한 티켓 예매 시스템을 만들어보세요. 이 시스템은 사용자로부터 다음과 같은 정보를 입력받아야 합니다:

1. 영화 제목 (문자열)
2. 관람 인원 수 (정수)
3. 예매자의 이름 (문자열)
4. 예매자의 전화번호 (문자열)

입력받은 정보를 바탕으로 다음과 같은 형식으로 예매 정보를 출력해야 합니다:

===== 영화 티켓 예매 정보 =====
영화 제목: [입력받은 영화 제목]
관람 인원: [입력받은 관람 인원 수]명
예매자 이름: [입력받은 예매자 이름]
예매자 전화번호: [입력받은 예매자 전화번호]

추가로, 티켓 가격은 1인당 10,000원으로 가정하고, 총 결제 금액을 계산하여 예매 정보 출력 후에 다음과 같이 출력해야 합니다:

총 결제 금액: [계산된 총 결제 금액]원

- `Scanner` 클래스를 사용하여 사용자로부터 입력을 받아야 합니다.
- 입력받은 정보는 적절한 자료형으로 저장되어야 합니다.
- 출력 형식은 예시와 정확히 일치해야 합니다. */

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("movie title");
        String movieTitle = sc.nextLine();
        System.out.println("number of people");
        int numPeople = sc.nextInt();
        sc.nextLine();
        System.out.println("name of ticket purchaser");
        String name = sc.nextLine();
        System.out.println("number of ticket purchaser");
        String number = sc.nextLine();

        System.out.println("===== 영화 티켓 예매 정보 =====");
        System.out.println("영화 제목: " + movieTitle);
        System.out.println("관람 인원: " + numPeople + "명");
        System.out.println("예매자 이름: " + name);
        System.out.println("예매자 전화번호: " + number);
        System.out.println("총 결제 금액: " + 10000 * numPeople + "원");

        sc.close();
    }
}
/* 목표: 10부터 0에 도달할 때까지 카운트다운을 출력하는 프로그램을 작성하세요.
조건:
1. 시작 숫자는 10입니다.
2. while 문을 사용하여, 현재 숫자에서 1씩 감소시키면서 카운트다운을 진행합니다.
3. 카운트다운은 0에 도달할 때까지 계속됩니다.
4. 각 숫자는 새로운 줄에 출력되어야 합니다. */

public class while1 {
    public static void main(String[] args) {
        int count = 10;
        while (count >= 0) {
            System.out.println("현재 카운트 : " + count);
            count--;
        }
        System.out.println("카운트 종료");
    }
}
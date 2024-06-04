/* 당신은 세 개의 불리언(boolean) 변수 x, y, 2를 가지고 있습니다. 이 변수들에 대해 다음
조건을 만족하는 프로그램을 작성하세요:

• x가 true 이고, y가 false 일 때, "조건 1 충족"을 출력합니다.
• y와 2 둘다 true 이거나, x와 2 둘다 false 일 때, "조건 2 충족"을 출력합니다.
• x,y, z 중 하나라도 true 이면 적어도 하나는 참"을 출력합니다.
• 세 변수 모두 false 일 때, 모두 거짓"을 출력합니다.

예를 들어, x= true, y = false, z= true 일 경우, 조건 1 충족"과 "적어도 하나는 참"을 출력해야 합니다 */

public class ifProblem {
    public static void main(String[] args) {
        boolean x = true, y = false, z = true;
        if (x && !y) {
            System.out.println("조건 1 충족");
        } else if (y && z || !x && !z) {
            System.out.println("조건 2 충족");
        } else if (x || y || z) {
            System.out.println("적어도 하나는 참");
        } else {
            System.out.println("모두 거짓");
        }
    }
}
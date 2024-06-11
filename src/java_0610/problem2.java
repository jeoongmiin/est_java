package java_0610;
/*  경찰이 당신을 과속으로 잡았을 때 내야 할 벌금을 계산하는 코드를 작성해보겠습니다.
    만약 당신의 속도가 60 이하라면 벌금은 없습니다.
    속도가 61에서 80 사이(포함)라면 벌금은 100원입니다.
    속도가 81 이상이라면 벌금은 200원입니다.
    단, 휴일인 경우 속도 한도가 5 더 높아집니다.

    속도가 60 이하라면 벌금은 0원입니다.
    속도가 61 이상이라면 벌금은 100원입니다.
    만약 휴일이라면 속도가 65라도 벌금은 0원입니다.*/

public class problem2 {
    public static void main(String[] args) {
        System.out.println(speedRacer(66, true));
    }
    static int speedRacer(int speed, boolean isHoliday) {
        int safeSpeed = 60, dangerSpeed = 80, tax = 0;
        if (isHoliday) {
            safeSpeed += 5;
            dangerSpeed += 5;
        }
        if (speed > dangerSpeed) tax = 200;
        if (speed <= safeSpeed) tax = 0;
        if (speed > safeSpeed && speed <= dangerSpeed) tax = 100;
        return tax;
    }
}
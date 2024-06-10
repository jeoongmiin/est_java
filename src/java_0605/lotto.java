package java_0605;
/* 퀴즈: 로또 번호 생성기
로또 번호 생성기 프로그램을 작성하세요. 이 프로그램은 1부터 45까지의 숫자 중 중복되지 않는 6개의 숫자를 무작위로 선택하여 출력합니다.
요구사항:
1. Random 클래스를 사용하여 난수를 생성해야 합니다.
2. 생성된 로또 번호는 오름차순으로 정렬되어 출력되어야 합니다.
3. 생성된 로또 번호는 서로 중복되지 않아야 합니다.
4. 출력 형식은 다음과 같아야 합니다:

    로또 번호: [번호1] [번호2] [번호3] [번호4] [번호5] [번호6]

    힌트:
    - 1부터 45까지의 숫자를 리스트나 배열에 저장하고, 해당 리스트에서 난수를 생성하여 번호를 선택할 수 있습니다.
    - 중복을 방지하기 위해 선택된 번호는 리스트에서 제거하거나, Set 자료구조를 사용할 수 있습니다.
    - 정렬에는 Arrays.sort() 메서드를 사용할 수 있습니다. */

import java.util.ArrayList;
import java.util.Random;

public class lotto {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        while (arr.size() < 6) {
            int number = random.nextInt(45) + 1;
            if (!arr.contains(number)) {
                arr.add(number);
            }
        }
        for (int a : arr) {
            System.out.printf("%d ", a);
        }
    }
}
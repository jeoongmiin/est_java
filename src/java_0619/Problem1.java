package java_0619;
/* 1.student 클래스를 만드는데 여기서는 no라는 int형, 그리고 name이라는 변수에는 String형 HashMap 구현
키는 Student, value (점수)int 데이터 넣기 put 메서드활용
entrySet()활용해서 getKey(), getValue() 메서드로 키와 값을 추출해 출력 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Problem1 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();
        map.put(new Student(1, "a"), 100);
        map.put(new Student(2, "b"), 95);
        map.put(new Student(3, "c"), 80);

        Set<Map.Entry<Student, Integer>> entries = map.entrySet();
        for (Map.Entry<Student, Integer> entry : entries) {
            System.out.println(entry.getKey().getNo() + " " + entry.getKey().getName() + " " + entry.getValue());
        }
    }
}
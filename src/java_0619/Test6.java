package java_0619;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        Map<Student, Integer> studentIntegerMap = new HashMap<>();

        studentIntegerMap.put(new Student(50, "홍길동"), 95);
        studentIntegerMap.put(new Student(50, "홍길동"), 95);

        System.out.println(studentIntegerMap.size());

        Set<Map.Entry<Student, Integer>> entries = studentIntegerMap.entrySet();

        for (Map.Entry<Student, Integer> entry : entries) {
            String name = entry.getKey().getName();
            int no = entry.getKey().getNo();
            Integer value = entry.getValue();
        }
    }
}
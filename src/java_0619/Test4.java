package java_0619;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();
        List<String> stringList = new ArrayList<>();
        stringList.add("홍길동");
        stringList.add("홍길동");
        stringList.add("홍길동");
        map.put("홍길동", stringList);

        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            List<String> stringList1 = map.get(next);
            System.out.println(stringList1);
        }
    }
}
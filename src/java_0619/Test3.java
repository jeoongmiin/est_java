package java_0619;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("홍길동", 30);
        map.put("홍길동", 40);

        System.out.println(map.get("홍길동"));
        System.out.println(map.remove("홍길동"));
    }
}
package java_0618;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("홍길동");
        arrayList.add("홍길동2");
        arrayList.add("홍길동2");
        arrayList.add("홍길동2");
        arrayList.add("홍길동2");
        arrayList.add("홍길동2");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            // arrayList.removeIf((s)-> s.equals("홍길동2"));
        }
        System.out.println("===================");
        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}